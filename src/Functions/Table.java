package Functions;

import java.util.Scanner;

public class Table {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        tables(number);
    }

    public static void tables(int number){

        for(int i = 1; i <= 10; i++){
            System.out.println(i*number);
        }
    }
}
