package Functions;

import java.util.Scanner;

public class Average {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        System.out.println(calculate(number1,number2,number3));
    }

    public static int calculate(int num1, int num2, int num3){

        return (num1+num2+num3)/3;
    }
}
