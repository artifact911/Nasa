package practice.sometasks.fighters;

import static practice.sometasks.fighters.Constants.RN;

public final class FighterGenerator {

    private static final int ALL_POINTS_VALUE = 30;

    private FighterGenerator() {
    }

    public static Fighter[] getPairOfFighters(String firstFighterName, String secondFighterName) {
        return new Fighter[]{getRandomFighter(firstFighterName), getRandomFighter(secondFighterName)};
    }

    private static Fighter getRandomFighter(String name) {
        int power = RN.nextInt(ALL_POINTS_VALUE) + 1;
        int hp = ALL_POINTS_VALUE - power;
        return new Fighter(power, hp, name);
    }
}
