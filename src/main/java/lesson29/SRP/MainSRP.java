package lesson29.SRP;
// SRP - Single Responsibility Principle states that a class should be responsible
// for a single task or a set of closely related tasks.
public class MainSRP {
    public static void main(String[] args) {
        String str="hello tms";
        if (InputValidator.validateInput(str)) {
            String processed=DataProcessor.processData(str);
            String formatted=OutputFormatter.formatOutput(processed);
            System.out.println(formatted);
        }
    }
}
