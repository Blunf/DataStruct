package NodeAndTree;

public class TwoChildrenException extends Exception {
    public TwoChildrenException(){
        super("Node has two children.");
    }
}