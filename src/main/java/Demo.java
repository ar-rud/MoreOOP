import java.lang.reflect.InvocationTargetException;
import java.rmi.UnexpectedException;

public class Demo {
    public static void main(String args[]) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, UnexpectedException {
        GameManager.play();
    }

}
