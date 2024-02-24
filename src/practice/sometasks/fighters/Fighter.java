package practice.sometasks.fighters;

import static practice.sometasks.fighters.Constants.RN;

public class Fighter {

    private final int power;
    private int hp;
    private final String name;

    public Fighter(int power, int hp, String name) {
        this.power = power;
        this.hp = hp;
        this.name = name;
    }

    private void changeHpAfterKick(int kickPower) {
        hp -= kickPower;
    }

    public boolean isHpValid() {
        return hp > 0;
    }

    public void tryDefendAttack(int kickPower) {
        int blockChance = RN.nextInt(100);
        if (blockChance < 33) {
            System.out.println("Боец " + this.name + " заблокировал удар");
        } else {
            changeHpAfterKick(kickPower);
            System.out.println("Боец " + this.name + " получил урон");
        }
    }

    public int tryAttack() {
        int randomModifier = (int) (this.power * 0.3);
        randomModifier = randomModifier > 0 ? randomModifier : 1;
        int max = this.power + randomModifier;
        int min = this.power - randomModifier;
        int kickPowerResult = RN.nextInt((max - min) + 1) + min;
        System.out.println("Боец " + this.name + " атакует с силой " + kickPowerResult);
        return kickPowerResult;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "power=" + power +
                ", hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }
}
