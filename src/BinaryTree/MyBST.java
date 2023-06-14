package BinaryTree;

import java.util.ArrayList;

import javax.swing.RowFilter.Entry;

import NodeAndTree.MyBinNode;
import NodeAndTree.MyBinTree;
import NodeAndTree.MyNode;
import NodeAndTree.TwoChildrenException;

public class MyBST extends MyBinTree{


    MyBST() {
        super();
        //TODO Auto-generated constructor stub
    }
    MyBST(Object e){
        super(e);
    }



    @Override
    public void Inorder(MyBinNode nd) {
        // TODO Auto-generated method stub
        if(hasLeft(nd)){
            Inorder(left(nd));
        }
        if(hasRight(nd)){
            Inorder(right(nd));
        }
        System.out.println(nd.element());
    }
    @Override
    public MyBinNode remove(MyBinNode nd){
        // TODO Auto-generated method stub
        MyBinNode pr = (MyBinNode)nd.parent();
        nd.setParent(null);
        for(MyNode ndd : nd.children()){
            ndd.setParent(pr);
        }
        return nd;
    }



    public MyBinNode BSTSearch(Object k, MyBinNode nd){
        if(this.isExternal(nd)){
            return nd;
        }
        if((int)k<(int)nd.element()){
            return BSTSearch(k, left(nd));
        }
        if((int)k>(int)nd.element()){
            return BSTSearch(k, right(nd));
        }
        return nd;
    }



    private MyBinNode nextNode(MyBinNode nd){
        int k = (int)nd.element();
        while(find(k)!=null){
            k++;
        }
        return (MyBinNode)find(k);
    }

    public Object find(Object k){
        MyBinNode w = BSTSearch(k, root());
        if(isExternal(w)){
            return null;
        }
        else{
            return w;
        }
    }
    
    public ArrayList findAll(Object k){
        ArrayList list = new ArrayList<>();
        MyBinNode w = BSTSearch(k, root());
        if(isExternal(w)){
            return null;
        }
        else{
            list.add(w);
            findAll(w.left());
        }
        return list;
    }
    public Object insert(Object k){
        if(isExternal(BSTSearch(k, root()))){
            BSTSearch(k, root()).setElement(k);
            return k;
        }
        else{
            insert(BSTSearch(k, root()).left());
        }
        return k;
    }
    public Object remove(Object k){
        if(isExternal(BSTSearch(k, root()))){
            return null;
        }
        else{
            remove(BSTSearch(k, root()));
        }
        return null;
    }

}
