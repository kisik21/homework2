package lessons1_20.homework8;

public class Patient {
    private int treatmentPlan;
    private String doctor;

    Patient(int plan) {
        this.treatmentPlan=plan;
    }

    public int getPlan() {
        return this.treatmentPlan;
    }

    public void setDoctor(String doctor) {
        this.doctor=doctor;
    }

    public String getDoctor() {
        return this.doctor;
    }
}
