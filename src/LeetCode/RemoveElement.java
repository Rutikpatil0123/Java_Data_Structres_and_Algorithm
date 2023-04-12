package LeetCode;

import java.util.ArrayList;

/*
   Given an integer array nums and an integer val,
    remove all occurrences of val in nums in-place.
    The order of the elements may be changed.
    Then return the number of elements in nums which are not equal to val.

 */

public class RemoveElement {

    public static void main(String[] args) {

        int [] arr = {0,1,2,2,3,0,4,2};

        int val = 2;

        System.out.println(op(arr,val));

        System.out.println(help(arr,val));

        for (int i = 0; i < help(arr,val); i++){
            System.out.println(arr[i]);
        }
    }

    public static int op(int[] arr, int val){
        int j = 0;
        int i = 0;
        while(j < arr.length){
            if(arr[j] != val) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;

            }
            j++;
        }
        return i;
    }


    public static int help(int arr[], int val){

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            arrayList.add(arr[i]);
        }

        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) == val){
                arrayList.remove(i);
            }
        }

        for(int i = 0; i < arrayList.size(); i++){
            arr[i] = arrayList.get(i);
        }

        return arrayList.size()-1;
    }
}
