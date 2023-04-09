package CollectionAndFrameWork;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueIntro {
    public static void main(String[] args) {

        Deque<Integer> de = new ArrayDeque<>();
        de.offerFirst(1);
        de.offerFirst(2);

        System.out.println(de);

        de.offerLast(5);
        de.offerLast(22);

        System.out.println(de);
    }
}
