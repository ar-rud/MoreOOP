package lordOfTheRings;
import java.util.Random;

import lordOfTheRings.kickStrategies.NobelKickStrategy;

public class King extends Character{
    public King(){
        super(
                new Random().nextInt(11)+5,
                new Random().nextInt(11) + 5,
                new NobelKickStrategy()
        );
   }
}
