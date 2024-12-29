import java.util.Random;

public class RandomizeSmellLevel {
    private static final int MIN_LEVEL = 0;
    private static final int MAX_LEVEL = 100;

    public static int generate() {
        Random random = new Random();
        return MIN_LEVEL + random.nextInt(MAX_LEVEL - MIN_LEVEL + 1);
    }
}
