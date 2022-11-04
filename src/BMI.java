import java.util.Scanner;

public class BMI {
    public static void main (String[] args){
        Scanner in= new Scanner(System.in);

        System.out.print("Please enter your height(meter): ");
        double height = in.nextDouble();

        System.out.print("Please enter your weight(kg): ");
        int weight = in.nextInt();

        double bmi = weight/(height*height);

        System.out.println("Your bmi is : "+bmi);
    }
}
