package Functions;

import java.util.Scanner;

public class GCD {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(Divisor(number1,number2));

    }

    public static int Divisor(int number1, int number2){

        while(number1 != number2){

            if(number1 > number2){
                number1 = number1-number2;
            }else {
                number2 = number2-number1;
            }
        }

       return number1;
    }
}
