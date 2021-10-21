package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.DEAFEN);
    }



    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boolean superOfThorISTrue=RPG_Game.random.nextBoolean();
        if (superOfThorISTrue){boss.setDamage(0);
            System.out.println(" Тор активировал действие");
        }else if (!(superOfThorISTrue)){
            boss.setDamage(boss.getDamage());


    }


    }


}
