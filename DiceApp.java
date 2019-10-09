import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceApp extends Thread {

    private int rolls;
    private String name;
    private static Random random;
    public static List<Integer> rollArray = new ArrayList<Integer>();

    public DiceApp(int rolls, String name) {
        this.rolls = rolls;
        this.name = name;
    }

    public void run() {
        for(int index =0; index<this.rolls; index++) {
        rollArray.add(getRandomNumberInRange());
        System.out.println(this.name + rollArray);
        }
    }

    private int getRandomNumberInRange() {

        random = new Random();
        int r = random.nextInt((6 - 1) + 1) + 1;
        return r;

    }
}
