import java.util.Random;

public class MaxNumber2 {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
        }

        System.out.println("En büyük sayı: " + max);
    }
}