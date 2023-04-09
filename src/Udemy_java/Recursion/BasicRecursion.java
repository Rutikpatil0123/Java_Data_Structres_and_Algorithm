package Udemy_java.Recursion;

public class BasicRecursion {

    public static void main(String[] args) {


        iterative(6);

        System.out.println();

        recursive(6);
    }


    // Iterative method

    public static void iterative(int n){

        for (int i = 0; i < n; i++){
            System.out.println("Hello");
        }
    }

    // Recursive method

    public static void recursive(int n){

        if(n == 0){
            return;
        }

        System.out.println("Hello");

        recursive(n-1);
    }
}
