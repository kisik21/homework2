package lessons1_20.homework8;

public class Therapist {

    Therapist() {

    }
    public void treat(Patient  patient) {
        Surgeon surgeon = new Surgeon();
        Dantist dantist = new Dantist();

        if (patient.getPlan()==1) {
            System.out.println("Surgeon, treat");
            surgeon.treat();
            patient.setDoctor("Surgeon");

        } else if (patient.getPlan()==2) {
            System.out.println("Dantist, treat");
            dantist.treat();
            patient.setDoctor("Dantist");
        } else {
            System.out.println("Therapist treats");
            patient.setDoctor("Therapist");

        }
    }


}
