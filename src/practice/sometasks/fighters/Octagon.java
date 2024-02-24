package practice.sometasks.fighters;

import static practice.sometasks.fighters.Constants.RN;

public class Octagon {

    private final Fighter firstFighter;
    private final Fighter secondFighter;

    public Octagon(Fighter firstFighter, Fighter secondFighter) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
    }

    public Fighter doPairFighting() {
        Fighter[] fighters = refereeHi();
        Fighter firstFighter = fighters[0];
        Fighter secondFighter = fighters[1];
        Fighter winner = null;
        int round = 1;

        while (winner == null) {
            System.out.println("Round " + round + ". Fight!");
            System.out.println("Уровень HP бойцов: ");
            System.out.println(firstFighter.getName() + " : " + firstFighter.getHp());
            System.out.println(secondFighter.getName() + " : " + secondFighter.getHp());

            secondFighter.tryDefendAttack(firstFighter.tryAttack());
            if(!secondFighter.isHpValid()) {
                winner = firstFighter;
                System.out.println("Боец " + secondFighter.getName() + " потерпел поражение");
                break;
            }
            firstFighter.tryDefendAttack(secondFighter.tryAttack());
            if(!firstFighter.isHpValid()) {
                winner = secondFighter;
                System.out.println("Боец " + firstFighter.getName() + " потерпел поражение");
                break;
            }
            round++;
            System.out.println("*********");
        }

        System.out.println("В этой схватке побеждает " + winner.getName());
        return winner;
    }

    private Fighter[] refereeHi() {
        System.out.println("Сегодня на ринге встречаются:");
        System.out.println(firstFighter.toString());
        System.out.println("Vs");
        System.out.println(secondFighter.toString());
        Fighter[] fighters = firstKickFighterGenerate();
        System.out.println("Первым бъет " + fighters[0].getName());
        return fighters;
    }

    private Fighter[] firstKickFighterGenerate() {
        Fighter[] fightersSource = new Fighter[]{firstFighter, secondFighter};
        Fighter[] fightersRange = new Fighter[fightersSource.length];
        int indexFirstFighter = RN.nextInt(2);
        fightersRange[0] = fightersSource[indexFirstFighter];
        fightersRange[1] = fightersSource[indexFirstFighter == 0 ? 1 : 0];

        return fightersRange;
    }
}
