package lordOfTheRings.kickStrategies;

import lordOfTheRings.Character;

public class HobbitKickStrategy implements KickStrategy {
    @Override
    public void kick(lordOfTheRings.Character kicker, Character toBeKicked) {
        System.out.println("Crying...\uD83D\uDE22\uD83D\uDE22\uD83D\uDE22");
    }
}
