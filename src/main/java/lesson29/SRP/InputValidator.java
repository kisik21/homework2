package lesson29.SRP;

public class InputValidator {
    public static  boolean validateInput(String input) {
        // Validate the input
        if (input == null || input.isEmpty()) {
            return false;
        }
        return true;
    }
}