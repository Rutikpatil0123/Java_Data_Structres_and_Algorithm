package CollectionAndFrameWork;

import java.util.NavigableSet;
import java.util.TreeSet;

public class nvaigableSetIntro {

    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(56);
        set.add(12);
        set.add(22);

        for (Integer x : set){
            System.out.println(x + " ");
        }

        System.out.println(set.floor(2));

        System.out.println(set.floor(11));

        System.out.println(set.higher(13));

        System.out.println(set.ceiling(5));

        System.out.println(set.lower(12));
    }
}
