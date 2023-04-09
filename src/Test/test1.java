package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList list = new ArrayList();

        int j = 1;

        while (j < 2) {

            int a = sc.nextInt();
            if (a > 0) {
                list.add(a);
            } else {
                break;
            }
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
