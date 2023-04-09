package Stack;

public class StackUsingLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class StackClass{
        public static Node head;
        public static Boolean isEmpty(){
            return head == null;
        }


        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop(){

            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){

            if(isEmpty()){
                return -1;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {

        StackClass stack = new StackClass();
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.push(3);

        while(!stack.isEmpty()){

            System.out.println(stack.peek());
            stack.pop();

        }

    }
}
