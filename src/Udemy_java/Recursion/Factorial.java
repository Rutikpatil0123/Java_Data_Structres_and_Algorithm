package Udemy_java.Recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(Fac(5));
    }

    public static int Fac(int n){

        if(n == 1){
            return 1;
        }

        return n * Fac(n-1);
    }
}
