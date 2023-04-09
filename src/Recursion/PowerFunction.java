package Recursion;

import java.util.Scanner;

public class PowerFunction {

    public static int calculatePower(int x, int n){

        if(x == 0){
            return 0;
        }

        if( n == 0)
        {
        return 1;
        }

        return x * calculatePower(x, n-1);
    }

    public static int OptimisedPower(int x, int n){


        if(x == 0){
            return 0;
        }

        if( n == 0)
        {
            return 1;
        }

        if(n % 2 == 0 ){

           return OptimisedPower(x , n/2) * OptimisedPower(x , n/2);
        }else{
            return OptimisedPower(x , n/2) * OptimisedPower(x , n/2) * x;
        }

    }

    public static void main(String[] args) {

        // Scanner class for input;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base");

        int x = sc.nextInt();

        System.out.println("Enter the power");

        int n = sc.nextInt();

        //System.out.println(calculatePower(x,n));

        System.out.println(OptimisedPower(x ,n));

    }
}
