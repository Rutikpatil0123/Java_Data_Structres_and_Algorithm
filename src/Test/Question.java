package Test;

/*
Problem Statement :
          Given, an array 'arr' of 'N' elements & integer 'M'
          find the element in the arr 'p' such that, array arr has the exactly
          'M' element greater than or equal to the 'p'.

  input :
       1st line: 'N' integer - the size of arr
       2nd line: N elements of arr
       3rd line: M integer

  output: Print integer p

  Sample :
  Inp :
    6 N
    1
    2
    3
    4
    5
    6
    3 = M

  Otp :
    4

  Explanation : '4' has exactly M=3 element greater than equal to 4 */

import java.util.*;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];


        for(int i = 0; i < N; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the M element");

        int M = sc.nextInt();

        Arrays.sort(arr);

        for (int i = 0; i < N; i++){

            System.out.println(arr[i] + " ");
        }


    }
}
