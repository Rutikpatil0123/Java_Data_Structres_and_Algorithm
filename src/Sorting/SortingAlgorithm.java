package Sorting;

import java.util.Scanner;

public class SortingAlgorithm {

    public static void printArray(int arr[], int size){

        for(int i = 0; i < size; i++){

            System.out.println(arr[i] + " ");
        }
    }

    public static void BubbleSort(int arr[], int size){

        for(int i = 0; i < size-1; i++){

            for(int j = 0; j < size-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[], int size){

        for(int i = 0; i < size-1; i++){

            int smallest = i;

            for(int j = i+1; j < size; j++){

                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        //Scanner Class for input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");

        int size = sc.nextInt();

        int arr [] = new int[size];

        System.out.println("Enter the array");

        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //BubbleSort(arr, size);

        selectionSort(arr,size);

        printArray(arr, size);
    }
}
