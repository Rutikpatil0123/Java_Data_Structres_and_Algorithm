package Udemy_java.Recursion;

public class Power {

    public static void main(String[] args) {
        
        double result  = Power(3,5);
        System.out.println(result);

    }
    
    public static double Power(double a, double b){

        if(b == 0){
            return 1;
        }

        if(a == 0 || b == 1){
            return a;
        }

        b--;
       return a * Power(a,b);
    }
}
