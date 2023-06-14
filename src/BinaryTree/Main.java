package BinaryTree;

public class Main {
    
    public static void main(String[] args){
        MyBST bst = new MyBST(6);
        bst.insert(2);
        bst.insert(1);
        bst.insert(4);
        bst.insert(9);
        bst.insert(8);
        bst.insert(9);
        System.out.println("---------------------");
        bst.find(8);
        bst.find(3);
        bst.insert(3);
        bst.insert(7);
        bst.insert(9);
        bst.remove(1);
        bst.remove(4);
        bst.insert(6);
        bst.find(3);
        bst.find(6);
        bst.findAll(9);
    }
}
