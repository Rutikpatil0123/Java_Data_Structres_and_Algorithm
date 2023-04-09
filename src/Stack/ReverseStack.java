package Stack;

import java.util.Stack;

public class ReverseStack {
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

        public static void reverseStack(Stack<Integer> s){

            if(s.empty()){
                return;
            }

            int top = s.pop();
            reverseStack(s);
            pushAtBottomMethod(top ,s);
        }

        public static void main(String[] args) {

            Stack<Integer> s = new Stack<>();

            s.push(2);
            s.push(3);
            s.push(4);

            reverseStack(s);


            while (!s.empty()){
                System.out.println(s.peek());
                s.pop();
            }

          //  reverseStack(s);


        }


}
