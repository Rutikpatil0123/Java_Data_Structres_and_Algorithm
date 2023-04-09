package Recursion;

public class PrintTillN {

    public static void main(String[] args) {

        PrintNumber(5);
    }

    public static void PrintNumber(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        PrintNumber(n-1);
    }
}
