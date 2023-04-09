package Functions;

import java.util.Scanner;

public class Fib {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        series(number);

    }

    public static void series(int number){

        int num1 = 0;
        int num2 = 1;

        for(int i = 1; i <= number; i++){
            System.out.print(num1 + " ");
            int temp = num2;
            num2 = num1+num2;
            num1 = temp;

        }
    }
}
