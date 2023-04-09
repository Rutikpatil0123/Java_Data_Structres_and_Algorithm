package Pattern_question;

import java.util.Scanner;

public class Pattern9 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int number = 1;

        for (int i = 1; i < Integer.MAX_VALUE-5; i++){
            for(int j = 1; j <= i; j++){

                System.out.print(number + " ");
                number++;

                if(number > range){

                    break;
                }
            }
            if(number > range){

                break;
            }

            System.out.println();
        }
    }
}
