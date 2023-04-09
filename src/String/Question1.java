package String;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String array[] = new String[size];

        int lengthOfArray = 0;

        for (int i = 0; i < size; i++){

            array[i] = sc.next();

            lengthOfArray += array[i].length();

        }

        System.out.println(lengthOfArray);
    }
}
