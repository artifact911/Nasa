package step.hw.meo;

public class Surgeon extends Doctors {

    @Override
    public boolean test(Recruit recruit) {
        return !recruit.isFlatFeet() && !recruit.isFracture();

    }

    @Override
    public String toString() {
        return "Surgeon's diagnosis: recruit has flat feet and/or fractures.";
    }
}
