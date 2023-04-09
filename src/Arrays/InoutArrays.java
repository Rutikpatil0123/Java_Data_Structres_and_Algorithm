package Arrays;

import java.util.Scanner;

public class InoutArrays {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();

        int Score[] = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++){

            int temp = sc.nextInt();

            Score[i] = temp;
        }

        for(int i = 0; i < Score.length; i++){
            System.out.println(Score[i]);
        }
    }
}
