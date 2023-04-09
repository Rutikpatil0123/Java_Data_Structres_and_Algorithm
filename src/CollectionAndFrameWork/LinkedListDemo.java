package CollectionAndFrameWork;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);

        ListIterator <Integer> listIterator = linkedList.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.next());
    }
}
