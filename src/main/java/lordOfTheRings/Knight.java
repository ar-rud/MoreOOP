package lordOfTheRings;
import java.util.Random;
import lordOfTheRings.kickStrategies.NobelKickStrategy;

public class Knight extends Noble {
    public Knight(){
        super(
                new Random().nextInt(11) + 2,
                new Random().nextInt(11) + 2,
                new NobelKickStrategy()
        );
    }

}
