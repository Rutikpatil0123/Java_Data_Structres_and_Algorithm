package Introduction_to_java;

import java.util.Scanner;

public class Input_in_java {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        output(name);
    }

    public static void output(String name){

        System.out.println(name);
    }
}
