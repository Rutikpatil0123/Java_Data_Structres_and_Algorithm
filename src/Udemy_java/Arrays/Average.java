package Udemy_java.Arrays;

import java.util.Scanner;

public class Average {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++){

            array[i] = sc.nextInt();
        }

        System.out.println(Average(array));
    }

    public static int Average(int array[]){

        int sum = 0;

        for(int elemet : array){
            sum += elemet;
        }

        return sum/array.length;
    }
}
