package lordOfTheRings;

import lordOfTheRings.kickStrategies.HobbitKickStrategy;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3, new HobbitKickStrategy());
    }
}