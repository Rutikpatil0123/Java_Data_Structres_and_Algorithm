package LeetCode;

import java.util.Scanner;
/*
  You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */
public class SearchIn2Dmatrix {

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

        int target = sc.nextInt();

        System.out.println(find(arr,target));

    }

    public static boolean find(int [][] arr, int target){

        int i = 0;
        int j = arr[i].length;

        while (i < arr.length & j >= 0){

            if(arr[i][j] == target) {
                return true;
            }
            else if(arr[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }


}
