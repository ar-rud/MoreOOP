package lordOfTheRings.kickStrategies;

import lordOfTheRings.Character;

public class NobelKickStrategy implements KickStrategy {
    @Override
    public void kick(lordOfTheRings.Character kicker, Character toBeKicked){
        toBeKicked.setHp(toBeKicked.getHp()-kicker.getPower());
    }
}
