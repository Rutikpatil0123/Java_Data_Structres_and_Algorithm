package LeetCode;

/*

    Given an integer array nums sorted in non-decreasing order,
     remove the duplicates in-place such that each unique element appears only once.
     The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */

import java.util.*;

public class RemoveDuplicateElementsFromSortedArray {

    public static void main(String[] args) {

        int [] arr = {0,0,1,1,2,3,3};

       // System.out.println(help(arr));

        System.out.println(optimisedApproach(arr));

        for (int i = 0; i < help(arr); i++){
            System.out.println(arr[i]);
        }

        System.out.println(optimisedApproach(arr));


    }

    public static int help(int[] arr){

        // TreeSet store elements in sorted order

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        //Collections.sort(set);

        int ans = set.size();
        int i = 0;
        for(Integer x : set){
            arr[i] = x;
            i++;
        }
        return ans;
    }

    public static int optimisedApproach(int[] arr){

        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
