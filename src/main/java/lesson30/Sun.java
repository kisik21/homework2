package lesson30;

public final class Sun {
    private static Sun instance;
    public String value;

    private Sun(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Sun getInstance(String value) {
        if (instance == null) {
            instance = new Sun(value);
        }
        return instance;
    }
}