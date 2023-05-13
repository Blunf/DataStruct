package NodeAndTree;

public class Main {
    
    public static void main(String[] args){
        MyBinTree tree = new MyBinTree();
        tree.addRoot("+");
        tree.insertLeft(tree.root(), "*");
        tree.insertRight(tree.root(), "*");
        tree.insertLeft(tree.root().left(), "2");
        tree.insertRight(tree.root().left(), "-");
        tree.insertLeft(tree.root().left().right(), "3");
        tree.insertRight(tree.root().left().right(), "1");
        tree.insertLeft(tree.root().right(), "3");
        tree.insertRight(tree.root().right(), "2");
        tree.Inorder(tree.root());
        System.out.print("\n=");
        int val = (int)tree.Postorder(tree.root());
        System.out.println(val);
    }
}
