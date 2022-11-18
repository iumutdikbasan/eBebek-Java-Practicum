import java.util.Arrays;

public class ArrayFrequancy {
    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] repeat = new int[arr.length];
        int index = 0;
        int i, j;

        int[] frequancy = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            frequancy[i] = 1;
        }
        for (i = 0; i < arr.length; i++) {

            for (j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {

                    repeat[index++] = arr[i];
                    frequancy[i]++;
                }

            }
            if (frequancy[i] >= 1) {
                if (repeat[i] != 0) {
                    System.out.println(repeat[i] + " sayisi " + frequancy[i] + " kadar tekrar etmiştir.");
                }
            }

        }
        System.out.println(Arrays.toString(repeat));

    }

}