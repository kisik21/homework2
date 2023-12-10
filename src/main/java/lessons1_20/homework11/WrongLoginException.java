package lessons1_20.homework11;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }
    public WrongLoginException(String message) {
        super(message);
    }
}