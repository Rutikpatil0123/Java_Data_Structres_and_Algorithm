import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

    static class Node {
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void preOrderTraversal(Node root){

            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public void postOrderTraversal(Node root){

            if(root == null){
                return;
            }

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        public void InOrderTraversal(Node root){

            if(root == null){
                return;
            }

            InOrderTraversal(root.left);
            System.out.print(root.data + " ");
            InOrderTraversal(root.right);
        }

        public void levelOrderTraversal(Node root){

            if(root == null){
                return;
            }

            Queue<Node> queue = new LinkedList<>();

            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()){
                Node currNode = queue.remove();

                if(currNode == null){
                    System.out.println();
                    if(queue.isEmpty()){
                        break;
                    }else{
                        queue.add(null);
                    }
                }else {

                    System.out.print(currNode.data + " ");

                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }

                }
            }
        }

        public int CountNodes(Node root){

            if(root == null){
                return 0;
            }

            int leftCount = CountNodes(root.left);
            int rightCount = CountNodes(root.right);

            return (leftCount+rightCount+1);
        }

        public int heightOfTree(Node root){

            if(root == null){
                return 0;
            }

            int leftCount = heightOfTree(root.left);
            int rightCount = heightOfTree(root.right);

            return Math.max(leftCount, rightCount) + 1;


        }

        public int sumOfNodes(Node root){

            if(root == null){

                return 0;
            }

            int leftCount = sumOfNodes(root.left);
            int rightCount = sumOfNodes(root.right);

            return leftCount + rightCount + root.data;


        }
    }




    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.preOrderTraversal(root);
        System.out.println();
        tree.InOrderTraversal(root);
        System.out.println();
        tree.postOrderTraversal(root);

        System.out.println();

        tree.levelOrderTraversal(root);
        System.out.println(tree.CountNodes(root));

        System.out.println(tree.heightOfTree(root));

        System.out.println(tree.sumOfNodes(root));
    }

}
