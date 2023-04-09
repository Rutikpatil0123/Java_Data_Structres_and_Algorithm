package Arrays;

import java.util.Scanner;

public class InputTwoDimentionArray {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int Score[][] = new int[rows][columns];

        for(int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                int temp = sc.nextInt();

                Score[i][j] = temp;
            }
        }

        for(int i = 0; i < rows; i++){

            for (int j = 0; j < columns; j++){
                System.out.print(Score[i][j] + " ");
            }

            System.out.println();

        }

    }
}
