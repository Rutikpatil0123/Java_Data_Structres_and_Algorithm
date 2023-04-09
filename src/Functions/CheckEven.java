package Functions;

import java.util.Scanner;

public class CheckEven {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();


        if(number % 2 == 0){
            System.out.println("Even is " + number);
        }else {
            System.out.println("Odd is " + number);
        }
    }
}
