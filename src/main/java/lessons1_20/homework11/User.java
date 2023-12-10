package lessons1_20.homework11;

public class User {

    public static boolean login(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Login should not be longer than 20 symbols and can't contain spaces.");
        }
        if (password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password should not be longer than 20 symbols, can't contain spaces and should contain at least one digit.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password must be equal.");
        }
        return true;
    }

}
