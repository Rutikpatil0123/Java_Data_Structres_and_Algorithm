package CollectionAndFrameWork;

import java.util.*;

public class SetIntro {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);

        // Insertion and removal of elements is in constant time

        Set<Integer> s = new HashSet<>(list);
        s.add(12);
        s.add(55);

        for(int x : s){
            System.out.println(x + " ");
        }

        s.clear();

        System.out.println(s);

        // InterSection of two sets
        //s.retainAll(s2);

        // add all;
        // s.addAll(s2);

        // LinkedHashSet maintains the order of insertion;

        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(52);
        set.add(12);
        set.add(123);

        System.out.println(set);


        List<StudentMarks> markList =  new ArrayList<>();
        markList.add(new StudentMarks(98, 88));
        markList.add(new StudentMarks(89, 70));
        markList.add(new StudentMarks(99, 100));
        markList.add(new StudentMarks(77, 55));
        markList.add(new StudentMarks(81, 84));
        markList.add(new StudentMarks(92, 28));


        Set<StudentMarks> set1 = new HashSet<>(markList);

        System.out.println(set1);

        // Although set contains the element but it has gentrated unique hascode for that elements in set so to use Contains method for custom class we have to override the hashCode and equals method

        System.out.println(set1.contains(new StudentMarks(98, 88)));




    }
}
