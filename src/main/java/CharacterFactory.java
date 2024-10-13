import java.lang.reflect.InvocationTargetException;
import java.rmi.UnexpectedException;
import java.util.Set;

import lordOfTheRings.Character;
import org.reflections.Reflections;

import java.util.Random;

public class CharacterFactory {
    public static lordOfTheRings.Character createCharacter()  throws
            InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException, UnexpectedException {
        Reflections reflections = new Reflections("lordOfTheRings");
        Set<Class<? extends lordOfTheRings.Character>> subTypes = reflections.getSubTypesOf(lordOfTheRings.Character.class);

        Random random = new Random();
        int characterIndex = random.nextInt(subTypes.size());

        int cnt = 0;
        for (Class<? extends Character> characterClass: subTypes) {
            if (cnt == characterIndex) {
                return characterClass.getDeclaredConstructor().newInstance();
            }
            cnt++;
        }
        throw new UnexpectedException("Something went wrong");
    }
}
