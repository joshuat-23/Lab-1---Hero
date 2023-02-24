import java.util.Random;
public class Hero {

    private String name;
    private int hitPoints;

    public Hero(String name){
        int hitPoints = 100;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String toString() {
        return("Hero{Name='" + name + "', hitPoints=" + hitPoints + "}");
    }

    public void attack(Hero opponent){
        Random rand = new Random();
        int number = rand.nextInt(99);
        double result = number / 100.0;

        if(result < 0.5){
            opponent.hitPoints = opponent.hitPoints - 10;
        }
        else{
            this.hitPoints = this.hitPoints - 10;
        }
    }

    public void senzuBean(){
        this.hitPoints = 100;
    }

    private void fightUntilTheDeathHelper(Hero opponent){
        int i = 0;
        while(i < this.hitPoints){
            attack(opponent);
        }
    }

    public String fightUntilTheDeath(Hero opponent){
        fightUntilTheDeathHelper(opponent);
        senzuBean();
        return(this.name + ": " + this.hitPoints + "       " + opponent.name + ": " + opponent.hitPoints);
    }

}
