package NodeAndTree;

import java.util.ArrayList;

public class MyTree {
    int size=0;
    public MyNode root;

    MyTree(){
        root = null;
    }
    MyTree(Object e){
        this.root=new MyNode(e);
        size++;
    }

    public int size(){
        return size;
    }
    public int depth(MyNode nd){
        if(nd == root){
            return 0;
        }
        return 1+depth(nd.parent());
    }
    public MyNode root(){
        return root;
    }
    public ArrayList<MyNode> child(MyNode nd){
        return nd.children();
    }
    public boolean isExternal(MyNode nd){
        if(nd.children().size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public MyNode addRoot(Object o){
        if(root==null){
            this.root = new MyNode(o);
        }
        else{
            MyNode nd = new MyNode(o);
            root.setParent(nd);
            this.root = nd;
        }
        return root;
    }
    public MyNode addNode(Object o){
        return new MyNode(o);
    }
    public MyNode addChild(MyNode nd, Object o){
        MyNode nnd = new MyNode(o);
        nnd.setParent(nd);
        nd.children().add(nnd);
        return nd;
    }
    public MyNode addChild(MyNode nd, int i, Object o){
        MyNode nnd = new MyNode(o);
        nnd.setParent(nd);
        nd.children().add(i,nnd);
        return nd;

    }
    public MyNode setChild(MyNode nd, int i, Object o){
        MyNode n = new MyNode(o);
        n.setParent(nd);
        nd.children().set(i, n);
        return nd;
    }
    public MyNode removeChild(MyNode nd, int i){
        nd.children().remove(i);
        return nd;
    }

    public void preOrder(){
        
    }

    public void PostOrder(MyNode nd){
        int total=0;
        for(int i=0; i<nd.children().size();i++){
            String str = nd.children().get(i).toString();
            int p = Integer.parseInt(str.substring(str.length()-2));
            total = total + p;
        }
        System.out.println(total);
    }
}
