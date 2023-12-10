package lessons1_20.lesson20;

import java.sql.*;

// Задача 1:
//1.1 Создать модель пользователя в Java(User).
//1.2 Создать соответствующую модели таблицу в базе данных(users).
//1.3 Вытянуть с помощью JDBC информацию о пользователе с id=1.
//1.4 Распарсить данные из ResultSet в объект User.

//Задача 2:
//        Вытянуть из базы данных среднее значение возраста пользователей из таблицы users
public class Practice {
    public static void main(String[] args) {

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDB", "root", "root");
            Statement statement= connection.createStatement();

            statement.execute("create table users(" +
                    "id integer auto_increment," +
                    "name varchar(20),  age integer, city varchar (20)," +
                    "primary key (id))");
            statement.execute("insert into users(name, age, city) values ('Vasya', 20, 'Minsk'), " +
                    "('Petya', 26, 'Minsk'), " +
                    "('Sanya', 31, 'Orsha')");
            ResultSet rs=statement.executeQuery("select * from users where id = 1;");
            rs.next();
            int id=rs.getInt("id");
            String name=rs.getString("name");
            int age=rs.getInt("age");
            String city=rs.getString("city");
            User user1 = new User(id, name, age, city);
            System.out.println(user1.getInfo());
            ResultSet rSet=statement.executeQuery("select AVG(age) from users;"); // average age of users
            rSet.next();
            System.out.println("average age is: " + rSet.getDouble("AVG(age)"));
        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }
}
