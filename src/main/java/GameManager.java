import lordOfTheRings.Character;
import java.lang.reflect.InvocationTargetException;
import java.rmi.UnexpectedException;

public class GameManager {
    public static void play() throws UnexpectedException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Character player1 = CharacterFactory.createCharacter();
        Character player2 = CharacterFactory.createCharacter();

        System.out.format("%s versus %s\n", player1, player2);

        int cnt = 0;
        while (player1.isAlive() && player2.isAlive()) {
            if (cnt%2 == 0){
                System.out.println(player1 + " kicks " + player2 + "\n");
                player1.kick(player2);
                System.out.println("result: " + player2 + "\n");
            } else {
                System.out.format(player2 + " kicks " + player1 + "\n");
                player2.kick(player1);
                System.out.format("result: " + player1 + "\n");
            }
            cnt++;
            System.out.format("===============================================");

        }
    }
}

