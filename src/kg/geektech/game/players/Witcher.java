package kg.geektech.game.players;

public class Witcher extends Hero{


    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.DEAD_AND_HELP);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length ; i++) {
            if (heroes[i].getHealth()<=0){
                heroes[i].setHealth(200);
                this.setHealth(0);
                System.out.println("Witcher активировал действие");
        }
            
        }
                
            
        }
}

