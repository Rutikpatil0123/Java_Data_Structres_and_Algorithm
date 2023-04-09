package Udemy_java.CodingExercies;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        PrimeNumber(size);
    }

    public static void PrimeNumber(int size){

        for (int i = 1; i < size; i++){

            boolean chaeck = false;

            for(int j = 2; j < i/2; j++){

                if(i%j == 0){

                    chaeck = true;
                }
            }

            if(chaeck){
                System.out.println(i);
            }
        }
    }
}
