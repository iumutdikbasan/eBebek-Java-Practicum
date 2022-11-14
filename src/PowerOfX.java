import java.util.Scanner;

public class PowerOfX {
    static int sum = 1;
    static int op(int power,int base){
        if(power==0){
            return 1;
        }
        sum *= base;
        op(power-1,base);
        return sum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the base number : ");
        int base = inp.nextInt();
        System.out.print("Please enter the power number : ");
        int power = inp.nextInt();

        System.out.print(op(power,base));
    }


}

