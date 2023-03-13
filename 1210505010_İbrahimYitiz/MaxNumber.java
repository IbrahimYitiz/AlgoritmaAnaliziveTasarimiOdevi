import java.util.Random;

public class MaxNumber {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("En büyük sayı: " + max);
    }
}
