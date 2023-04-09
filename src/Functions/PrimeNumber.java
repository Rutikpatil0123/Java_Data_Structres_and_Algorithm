package Functions;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        checkPrime(number);


    }

    public static void checkPrime(int number){

        for(int i = 2; i <= number/2; i++){

            if(number%i == 0){
                System.out.println("Not Prime Number " + number);
                return;
            }
        }

        System.out.println("Prime Number " + number);
    }
}