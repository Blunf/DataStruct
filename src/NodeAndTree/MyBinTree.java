package NodeAndTree;

public class MyBinTree extends MyTree{
    
    MyBinTree(){
        super();
    }
    MyBinTree(Object e){
        super(e);
    }

    public Boolean isEmpty(){
        if(this.size==0){
            return true;
        }
        return false;
    }
    public boolean isRoot(MyBinNode nd){
        if(nd==root){
            return true;
        }
        return false;
    }
    public boolean isInternal(MyBinNode nd){
        if (isExternal(nd)){
            return false;
        }
        return true;
    }
    public boolean isExternal(MyBinNode nd){
        if(nd.right()==null&&nd.left()==null){
            return true;
        }
        return false;
    }
    public boolean hasLeft(MyBinNode nd){
        if(nd.left()==null){
            return false;
        }
        return true;
    }
    public boolean hasRight(MyBinNode nd){
        if(nd.right()==null){
            return false;
        }
        return true;
    }

    public MyBinNode root(){
        return (MyBinNode)root;
    }
    public MyBinNode parent(MyBinNode nd){
        return (MyBinNode)nd.parent();
    }
    public MyBinNode left(MyBinNode nd){
        return nd.left();
    }
    public MyBinNode right(MyBinNode nd){
        return nd.right();
    }
    public MyBinNode addRoot(Object o){
        if(root==null){
            this.root = new MyBinNode(o);
        }
        else{
            MyNode nd = new MyBinNode(o);
            root.setParent(nd);
            this.root = nd;
        }
        return (MyBinNode)root;
    }
    public MyBinNode addNode(Object o){
        return new MyBinNode(o);
    }
    public MyBinNode insertLeft(MyBinNode nd, Object o){
        MyBinNode n = new MyBinNode(o);
        n.setParent(nd);
        nd.addLeft(n);
        return nd;
    }
    public MyBinNode insertRight(MyBinNode nd, Object o){
        MyBinNode n = new MyBinNode(o);
        n.setParent(nd);
        nd.addRight(n);
        return nd;
    }
    public Object replace(MyBinNode nd, Object o){
        nd.setElement(o);
        return nd;
    }
    public MyBinNode remove(MyBinNode nd) throws TwoChildrenException{
        if(nd.children().size()!=1){
            throw new TwoChildrenException();
        }
        MyBinNode pr = (MyBinNode)nd.parent();
        nd.setParent(null);
        for(MyNode ndd : nd.children()){
            ndd.setParent(pr);
        }
        return nd;
    }
    public void attach(MyBinNode nd, MyBinNode nd2, MyBinNode nd3) throws NotExternalException{
        if (hasLeft(nd) || hasRight(nd)) {
            throw new NotExternalException();
        }
    
        nd.addLeft(nd2);
        nd.addRight(nd3);
    }
    
    public void Inorder(MyBinNode nd){
        if(hasLeft(nd)){
            System.out.print("(");
            Inorder(nd.left());
        }
        System.out.print(nd.element());
        if(hasRight(nd)){
            Inorder(nd.right());
            System.out.print(")");
        }
    }
    public Object Postorder(MyBinNode nd){
        if(isExternal(nd)){
            return nd.element();
        } else {
            Object a = Postorder(nd.left());
            Object b = Postorder(nd.right());
    
            Object op = nd.element();
    
            if(op instanceof String && ((String) op).equals("*")){
                int x = Integer.parseInt(String.valueOf(a));
                int y = Integer.parseInt(String.valueOf(b));
                return(x * y);
            } else if(op instanceof String && ((String) op).equals("/")){
                int x = Integer.parseInt(String.valueOf(a));
                int y = Integer.parseInt(String.valueOf(b));
                return(x / y);
            } else if(op instanceof String && ((String) op).equals("+")){
                int x = Integer.parseInt(String.valueOf(a));
                int y = Integer.parseInt(String.valueOf(b));
                return(x + y);
            } else if(op instanceof String && ((String) op).equals("-")){
                int x = Integer.parseInt(String.valueOf(a));
                int y = Integer.parseInt(String.valueOf(b));
                return(x - y);
            } else {
                return null;
            }
        }
    }

}
       
// Integer.parseInt(a)