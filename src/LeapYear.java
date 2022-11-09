import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        int year;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter year : ");
        year = inp.nextInt();

        int leap = year%400;

        if ((leap%4)==0){
            System.out.println("Leap Year.");
        }
        else{
            System.out.println("Not Leap Year.");
        }
    }
}