package Introduction_to_java;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String Greatings = sc.nextLine();

        switch (Greatings){
            case "English" :
                System.out.println("Hello");
                break;

            case "Hindi" :
                System.out.println("Namaste");
                break;

            case "French" :
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Hi");

        }
    }
}
