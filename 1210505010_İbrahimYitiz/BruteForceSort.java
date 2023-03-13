import java.util.Random;
public class BruteForceSort {

    public static void main(String[] args) {

        int[] arr = new int[10000];
        Random rand = new Random();

        // Rastgele sayılarla dizi oluşturma
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }

        // Sıralama işlemi
        long startTime = System.currentTimeMillis();
        bruteForceSort(arr);
        long endTime = System.currentTimeMillis();

        // Sıralanmış dizi
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        // Çalışma süresi
        long totalTime = endTime - startTime;
        System.out.println("\n\nÇalışma Süresi: " + totalTime + " milisaniye");
    }

    public static void bruteForceSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}