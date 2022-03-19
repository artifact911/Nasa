package step.hw.meo;

public class Dentist extends Doctors {

    @Override
    public boolean test(Recruit recruit) {
        return recruit.getImplantCount() <= 1;
    }

    @Override
    public String toString() {
        return "Dentist's diagnosis: recruit has more than one implant.";
    }
}
