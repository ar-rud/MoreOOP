package lordOfTheRings;
import lordOfTheRings.kickStrategies.KickStrategy;

public abstract class Noble extends Character {
    public Noble(int power, int hp, KickStrategy kickStrategy) {
        super(power, hp, kickStrategy);
    }
}
