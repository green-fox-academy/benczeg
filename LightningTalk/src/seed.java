import java.util.Random;

public class seed {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(999);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

    }
}
