package lordOfTheRings.kickStrategies;

import lordOfTheRings.Character;

public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(lordOfTheRings.Character kicker, Character toBeKicked){
        if (kicker.getPower() > toBeKicked.getPower()) {
            toBeKicked.setHp(0);
        }
        else {
            toBeKicked.setPower(toBeKicked.getHp() - 1);
        }
    }
}
