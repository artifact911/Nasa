package practice.sometasks.fighters;

public class FightingRunner {

    public static void main(String[] args) {
        Fighter[] pairOfFighters = FighterGenerator.getPairOfFighters("Саша", "Лена");
        Octagon octagon = new Octagon(pairOfFighters[0], pairOfFighters[1]);
        octagon.doPairFighting();
    }

}
