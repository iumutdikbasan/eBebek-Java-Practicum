import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {

        int distance, age, trip;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the distance(km): ");
        distance = inp.nextInt();

        System.out.print("Enter your age: ");
        age = inp.nextInt();

        System.out.println("Enter trip type (1 => One Way trip , 2 => Round trip ): ");
        trip = inp.nextInt();

        double amount = (distance * 0.10);

        double babydiscount = (amount*0.5);

        double kid_discount = (amount*0.1);

        double elderdiscount = (amount*0.3);


        if (trip == 1){
            if(age<12) {
                System.out.println(amount - babydiscount);
            } else if (age>12 && age<24) {
                System.out.println(amount-kid_discount);
            } else if (age>24 && age<65) {
                System.out.println(amount);
            } else if (age>65) {
                System.out.println(amount-elderdiscount);
            }
        }
        else if(trip==2){
            if(age<12){
                System.out.println(((amount-babydiscount)-(amount-babydiscount)*0.2)*2);
            }else if (age>12 && age<24) {
                System.out.println(((amount-kid_discount)-(amount-kid_discount)*0.2)*2);
            } else if (age>24 && age<65) {
                System.out.println(amount * 2);
            }
            else if (age>65) {
                System.out.println(((amount-elderdiscount)-(amount-elderdiscount)*0.2)*2);
            }
        }
    }
}