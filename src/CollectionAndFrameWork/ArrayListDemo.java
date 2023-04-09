package CollectionAndFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(55);

        System.out.println(list);

        list.remove(2);
        list.set(1, 26);

        for(int i : list){
            System.out.println(i);
        }

        List<Integer> list1 = new ArrayList<>(list);

        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add(61);
        list2.add(21);
        list2.add(10);

        list2.addAll(list);
        list2.add(2);

        System.out.println(list2);

        System.out.println(list2.indexOf(10));

        System.out.println(list2.lastIndexOf(2));

        List list3 = list2.subList(1,4);

        System.out.println(list3);

        Integer arr[] = (Integer[]) list3.toArray(new Integer[0]);

        for(int x : arr){
            System.out.println(x + " ");
        }






    }
}
