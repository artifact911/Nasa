package step.hw.meo;

public class Oculist extends Doctors {
    private String chooseDiagnosis;

    @Override
    public boolean test(Recruit recruit) {
        if (recruit.getVisionCoeff() < 0.8) {
            chooseDiagnosis = "Myopia";
        } else if (recruit.getVisionCoeff() > 1.2) {
            chooseDiagnosis = "Hyperopia";
        }

        return recruit.getVisionCoeff() > 0.8 && recruit.getVisionCoeff() < 1.2;
    }

    @Override
    public String toString() {
        return "Oculist's diagnosis: recruit has " + chooseDiagnosis + ".";
    }
}
