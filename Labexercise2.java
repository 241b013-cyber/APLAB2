import java.util.Random;

public class Labexercise2 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Random numbers:");
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(100) + 1; // 1 to 100
            System.out.println(num);
        }
    }
}
