package LinkedList;

 class ll {

    Node head;
    private int size;

    ll(){
        size = 0;
    }

 public class Node {

     String data;
     Node next;

     Node(String data) {
         this.data = data;
         this.next = null;
         size++;
     }
 }
        public void addFirst(String data){

            Node newNode = new Node(data);


            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public void addLast(String data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            Node currentNode = head;

            while (currentNode.next != null){
                currentNode = currentNode.next;
            }


            currentNode.next = newNode;


        }

        public void printData(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

            Node currentNode = head;

            while (currentNode != null){

                System.out.print(currentNode.data + " -> ");

                currentNode = currentNode.next;
            }

            System.out.println("null");

        }

        public void deleteFirst(){

        if(head == null){
            return;
        }

        size--;
        head = head.next;
        }

        public void deleteLast(){
        if (head == null){
            return;
        }

        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null){

            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        }

        public int getSize(){
        return size;
        }

        public void deleteAtIndex(int index){

        Node CurrentNode = head.next;
        Node previousNode = head;

        if(head == null){
            return;
        }

        if(index == 1){
            deleteFirst();
            return;
        }

        while (index > 1 && CurrentNode.next != null){
         CurrentNode = CurrentNode.next;
         previousNode = previousNode.next;
         index--;

        }

        previousNode.next = CurrentNode.next;
        return;
        }

        public void IterativeReverse(){

        if (head == null && head.next == null){
            return;
        }

        Node prevNode = null;
        Node currentNode = head;

        while (currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }

        head.next = null;
        head = prevNode;
        }

        public Node RecursiveReverse(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = RecursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
        }


    public static void main(String[] args) {

        ll list = new ll();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("my");
        list.addLast("name");
        list.printData();
        list.deleteAtIndex(2);
        list.IterativeReverse();
        list.printData();


      list.head = list.RecursiveReverse(list.head);

//        list.deleteFirst();
//        list.deleteLast();
        list.printData();
        System.out.println(list.getSize());

    }
}
