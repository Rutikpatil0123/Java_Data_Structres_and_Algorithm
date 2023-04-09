package Recursion;

public class PrintOneTillN {

    public static void main(String[] args) {

        PrintNumber(5);
    }

    public static void PrintNumber(int n){

        if(n == 0){
            return;
        }

        PrintNumber(n-1);

        System.out.println(n);
    }
}
