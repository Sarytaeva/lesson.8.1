package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }



    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int b = RPG_Game.random.nextInt(25+1);

        setDamage(getDamage()+b);
    }
}
