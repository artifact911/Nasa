package step.hw.meo;

public class Psychiatrist extends Doctors {

    @Override
    public boolean test(Recruit recruit) {
        return recruit.getDiagnosis().equals("Healthy");
    }

    @Override
    public String toString() {
        return "Psychiatrist's diagnosis: recruit is Crazy.";
    }
}
