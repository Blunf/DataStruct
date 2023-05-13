package NodeAndTree;

import java.util.ArrayList;

public class MyNode{
    private Object element;
    private MyNode parent;
    private ArrayList<MyNode> children = new ArrayList<>();

    MyNode() {
    }
    MyNode(Object e){
        this.element = e;
    }
    MyNode(Object e, MyNode nd){
        this.element = e;
        this.parent = nd;
    }
    MyNode(Object e, MyNode nd, ArrayList<MyNode> ch){
        this.element = e;
        this.parent = nd;
        this.children = ch;
    }

    public Object element(){
        return element;
    }
    public MyNode parent(){
        return parent;
    }
    public ArrayList<MyNode> children(){
        return children;
    }

    public int degree(){
        return children.size();
    }
    public void setElement(Object o){
        this.element = o;
    }
    public void setParent(MyNode n){
        this.parent = n;
        n.children.add(this);
    }
    public void setChild(ArrayList<MyNode> list){
        this.children = list;
        for(int i = 0; i<list.size(); i++){
            list.get(i).setParent(this);
        }
    }
}