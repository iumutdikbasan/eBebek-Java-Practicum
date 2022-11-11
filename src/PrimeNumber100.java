import java.util.Scanner;

public class PrimeNumber100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int end = 100;
        for (int i = 1; i <= end; i++){
            if(i%i==0&&i%1==0&&i%2!=0&&i%3!=0&&i%5!=0) {
                System.out.println(i);
            }
        }
    }
}