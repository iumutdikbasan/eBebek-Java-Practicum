import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayisini Giriniz: ");
        int n = scanner.nextInt();

        int x = 0;
        int y = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            y += x;
            x = y - x;
        }
    }
}