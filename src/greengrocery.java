import java.util.Scanner;

public class greengrocery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("how many kilograms of apples will you buy: ");
        int applekg = in.nextInt();

        System.out.print("how many kilograms of pears will you buy: ");
        int pearkg = in.nextInt();

        System.out.print("how many kilograms of tomatoes will you buy: ");
        int tomatoeskg = in.nextInt();

        System.out.print("how many kilograms of bananas will you buy: ");
        int bananakg = in.nextInt();

        System.out.print("how many kilograms of eggplants will you buy: ");
        int eggplantkg = in.nextInt();

        double amount = (pearkg*2.14) + (applekg*3.67) + (tomatoeskg*1.11) + (bananakg*0.95) + (eggplantkg*5.00);
        System.out.print("Your amount is "+amount);
    }
}
