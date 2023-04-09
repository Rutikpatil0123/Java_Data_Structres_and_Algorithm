package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(12);
        list.add(0);

        System.out.println(list);

        System.out.println(list.get(2));

        Collections.sort(list);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        list.set(1, 2);

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
