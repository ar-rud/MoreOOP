package lordOfTheRings;

import lordOfTheRings.kickStrategies.ElfKickStrategy;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKickStrategy());
    }
}
