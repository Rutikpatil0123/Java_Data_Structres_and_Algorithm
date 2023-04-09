package Introduction_to_java;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]){

        Source sc = new Source();

        while (true){

            Double number1 = sc.inputNumber();
            Double number2 = sc.inputNumber();

            Double result = sc.Calculate(number1, number2);

            sc.display(result);

        }

    }

}

class Source{

    public Double inputNumber(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        Double Number = sc.nextDouble();

        return Number;
    }

   public Double Calculate(Double a, Double b){

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the operator");

       String operator = sc.nextLine();

       Double result = 0.0;

       switch (operator){

           case "+" :
               result = a+b;
               break;

           case "-" :
               result = a-b;
               break;

           case "*" :
               result = a*b;
               break;

           case "/" :
               result = a/b;
               break;

           default :
               result = 0.0;

       }

       return result;
    }

    public void display(Double result){
        System.out.println("Result is " + result);
    }
}
