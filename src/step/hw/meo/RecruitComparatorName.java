package step.hw.meo;

import java.util.Comparator;

public class RecruitComparatorName implements Comparator<Recruit> {

    @Override
    public int compare(Recruit o1, Recruit o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
