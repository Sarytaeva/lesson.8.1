package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        int a = RPG_Game.random.nextInt(3) + 2;

        if (a == 2) {
            setDamage(getDamage() * 2);

        } else if (a == 3) {
            setDamage(getDamage() * 3);

        } else if (a == 4) {
            setDamage(getDamage() * 4);
        }
        System.out.println(a);
    }
}
