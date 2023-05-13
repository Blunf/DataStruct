package NodeAndTree;


public class MyBinNode extends MyNode{
    MyBinNode(){
        super();
    }
    MyBinNode(Object e){
        super(e);
    }


    public MyBinNode left(){
        if(this.children().isEmpty()){
            return null;
        }
        else if(this.children().get(0)==null){
            return null;
        }
        return (MyBinNode) this.children().get(0);
    }
    public MyBinNode right(){
        if(this.children().isEmpty()){
            return null;
        }
        else if(this.children().get(1)==null){
            return null;
        }
        return (MyBinNode) this.children().get(1);
    }
    public void addLeft(MyBinNode v){
        this.children().set(0, v);
        v.setParent(this);
    }
    public void addRight(MyBinNode v){
        this.children().set(1, v);
        v.setParent(this);
    }
}