package step.hw.meo;

public class Therapist extends Doctors {
    private String chooseDiagnosis;

    @Override
    public boolean test(Recruit recruit) {
        if (recruit.getCardiogram() < 60) {
            chooseDiagnosis = "Bradycardia";
        } else if (recruit.getCardiogram() > 80) {
            chooseDiagnosis = "Tachycardia";
        }

        return (int) recruit.getCardiogram() > 60 && (int) recruit.getCardiogram() < 80;
    }

    @Override
    public String toString() {
        return "Therapist's diagnosis: recruit has " + chooseDiagnosis + ".";
    }
}
