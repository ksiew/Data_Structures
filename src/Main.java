
public class Main {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(5);
        //list of values being inputted into the tree
        int[] test = {1,2,3,4,5,6,7};
        for(int i: test){
            tree.add(i);
        }
        tree.fullPrint();
    }
}
