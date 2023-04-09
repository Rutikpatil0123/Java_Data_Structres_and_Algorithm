package CollectionAndFrameWork;

import java.util.Stack;

public class StackIntro {

    public static void main(String[] args) {

        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);

        for (int x : s){
            System.out.println(x + " ");
        }

        System.out.println(s.peek());
    }
}
