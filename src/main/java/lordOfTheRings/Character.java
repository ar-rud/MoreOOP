package lordOfTheRings;


import lordOfTheRings.kickStrategies.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private
        int power;
        int hp;
        KickStrategy kickStrategy;

    public boolean isAlive(){return hp != 0;}
    public void kick(Character c){
        kickStrategy.kick(this, c);
    };

    public void setHp(int hp) {
        if (hp >= 0){
            this.hp = hp;
        }
        else{
            this.hp = 0;
        }
    }

    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + '}';
    }

}
