import java.util.Arrays;
import java.util.Scanner;

public class MinandMaxNumber {
    public static void main(String[] args) {
        int elemanSayisi;
        int sayi;
        int max;
        int min;

        Scanner klavye = new Scanner(System.in);
        System.out.print("How many numbers will you enter : ");
        elemanSayisi = klavye.nextInt();


        int[] dizi = new int[elemanSayisi];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Enter numbers : ");
            sayi = klavye.nextInt();
            dizi[i] = sayi;

        }

        max = dizi[0];
        min = dizi[0];

        for (int i = 1; i <dizi.length ; i++) {
            if (dizi[i]>max){
                max = dizi[i];
            }
            if (dizi[i]<min){
                min = dizi[i];
            }
        }
        System.out.println("Max number : "+max);
        System.out.println("Min number : "+min);





    }
}