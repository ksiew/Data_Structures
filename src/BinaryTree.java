/**
 * Binary search tree data structure, when an element in inputted, it is sent to the right
 * child of the tree if it is larger than the current value, or to the left if it is less than
 * This continues until it becomes a leaf.
 */
public class BinaryTree {
    //first node of the tree
    static Node root;

    public static class Node{
        int value;
        Node childL = null;
        Node childR = null;
        int depth;

        public Node(int in) {
            value = in;
        }

        public int get() {
            return value;
        }
    }

    public BinaryTree(int inValue) {
        root = new Node(inValue);
    }
    public int add(int inValue){
        if(inValue > root.get()){
            if(root.childR == null){
                root.childR = new Node(inValue);
                return 1;
            }else{
                return add(inValue,root.childR);
            }
        }else{
            if(root.childL == null){
                root.childL = new Node(inValue);
                return 1;
            }else{
                return add(inValue,root.childL);
            }
        }
    }
    public int add(int inValue, Node parent){
        if(inValue > parent.get()){
            if(parent.childR == null){
                parent.childR = new Node(inValue);
                return 1;
            }else{
                return add(inValue,parent.childR);
            }
        }else{
            if(parent.childL == null){
                parent.childL = new Node(inValue);
                return 1;
            }else{
                return add(inValue,parent.childL);
            }
        }
    }

    public void print(Node cursor){
        System.out.println(cursor.value);
        if(cursor.childL != null){
            print(cursor.childL);
        }
        if(cursor.childR != null){
            print(cursor.childR);
        }
    }

    //prints the tree in preorder format
    public void fullPrint(){
        this.print(root);
    }

}
