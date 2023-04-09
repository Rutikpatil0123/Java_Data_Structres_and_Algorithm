package LinkedList;

import java.util.LinkedList;

public class CollectionFrameWorkLL {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Ram");
        list.addFirst("me");
        list.add("je");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }

        list.remove();
        list.removeFirst();
        System.out.println(list);


        System.out.println(list.size());
    }
}
