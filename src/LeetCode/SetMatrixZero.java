package LeetCode;

/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
  You must do it in place.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class SetMatrixZero {

   static class Node{
       int a;
       int b;

       Node(int a, int b){
           this.a = a;
           this.b = b;
       }
    }

    public static void main(String[] args) {

        int n,m;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int [][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                arr[i][j] = sc.nextInt();
            }
        }

        BruteForce(arr);

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }



    }

    public static void makeRowZero(int[][] arr, int row){

        for(int j = 0; j < arr[0].length; j++){
            if(arr[row][j] != 0){
                arr[row][j] = Integer.MIN_VALUE;
            }
        }
    }

    public static void makeColumnZero(int[][] arr, int column){
        for(int j = 0; j < arr.length; j++){
            if(arr[j][column] != 0){
                arr[j][column] = Integer.MIN_VALUE;
            }
        }
    }

    public static void BruteForce(int [][] arr){


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                if(arr[i][j] == 0){
                    makeRowZero(arr,i);
                    makeColumnZero(arr,j);

                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                if(arr[i][j] == Integer.MIN_VALUE){
                    arr[i][j] = 0;
                }
            }
        }
    }


}
