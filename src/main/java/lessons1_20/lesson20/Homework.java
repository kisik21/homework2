package lessons1_20.lesson20;

import java.sql.*;
import java.util.Scanner;

// Задача 1:
//Реализовать CRUD операции для модели из вашего будущего проекта(или для User).
public class Homework {
    public static void main(String[] args) {
        try{
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDB", "root", "root");
            Statement statement= connection.createStatement();
            int t;
            int id;
            Scanner in = new Scanner(System.in);
            do {
                System.out.println("""
                    choose operation:
                    1 - add new user
                    2 - show table users
                    3 - show user info
                    4 - update user info
                    5 - delete user
                    6 - delete table
                    7 - exit
                    """);
                t=in.nextInt();
                in.nextLine(); // Scanner skips lines after nextInt :(
                switch (t) {
                    case 1 -> {
                        System.out.println("Enter name: ");
                        String name = in.nextLine();
                        System.out.println("Enter age: ");
                        int age = in.nextInt();
                        in.nextLine(); // same
                        System.out.println("Enter city: ");
                        String city = in.nextLine();
                        statement.execute("insert into users(name, age, city) values ('" + name + "'," + age + ", '" + city + "');");
                    }
                    case 2 -> {
                        System.out.println("id | name | age | city");
                        ResultSet rs=statement.executeQuery("select * from users ");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("city"));
                        }
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("Enter user id:");
                        id=in.nextInt();
                        ResultSet rs=statement.executeQuery("select * from users where id =" + id + ";");
                        while (rs.next()) {
                            System.out.println(rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("city"));
                        }
                    }
                    case 4 -> {
                        System.out.println("Enter new name (leave empty if doesn't change): ");
                        String newName = in.nextLine();
                        System.out.println("Enter new age:(enter -1 if doesn't change) ");
                        int newAge = in.nextInt();
                        in.nextLine(); // same
                        System.out.println("Enter new city (leave empty if doesn't change): ");
                        String newCity = in.nextLine();
                        System.out.println("Enter user id:");
                        id=in.nextInt();
                        if (!newName.isEmpty()) {
                            statement.execute("update users set name ='" + newName + "' where id=" + id + ";");
                        }
                        if (newAge!=-1) {
                            statement.execute("update users set age =" + newAge + " where id=" + id + ";");
                        }
                        if (!newCity.isEmpty()) {
                            statement.execute("update users set city ='" + newCity + "' where id=" + id + ";");
                        }
                    }
                    case 5 -> {
                        System.out.println("Enter user id:");
                        id=in.nextInt();
                        statement.execute("delete from users where id=" + id + ";");
                    }
                    case 6 -> {
                        System.out.println("R u sure? (Y/N)");
                        if (in.nextLine().equals("Y")) {
                            statement.execute("drop table users;");
                            System.out.println("table deleted");
                            return ;
                        }
                    }
                }
            } while (t!=7);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
