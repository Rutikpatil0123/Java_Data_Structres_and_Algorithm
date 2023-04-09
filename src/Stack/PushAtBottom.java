package Stack;

import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottomMethod(int data, Stack<Integer> s){

        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.peek();
        s.pop();
        pushAtBottomMethod(data, s);
        s.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(2);
        s.push(3);
        s.push(4);

        pushAtBottomMethod(1, s);

        while (!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
