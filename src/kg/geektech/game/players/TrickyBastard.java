package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class TrickyBastard extends Hero{

    public TrickyBastard(int health, int damage) {
        super(health, damage, SuperAbility.MAKE_A_JOKE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Boolean randomBoolean= RPG_Game.random.nextBoolean();
        if (randomBoolean){
            this.setHealth(0);
            this.setDamage(0);
            System.out.println("Притворился мертвым");
        } else  if (!(randomBoolean)){
            this.setDamage(this.getDamage());
            this.setHealth(this.getHealth());
        }


    }
}
