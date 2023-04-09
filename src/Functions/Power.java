package Functions;

import java.util.Scanner;

public class Power {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(powerFunction(number1,number2));

    }

    public static int powerFunction(int number1, int number2){

        int result = 1;

        while(number2 != 0){
             result = number1*result;
             number2--;
        }
        return  result;
    }
}
