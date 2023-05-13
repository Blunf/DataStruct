package Entry;

import java.util.ArrayList;
import java.util.Comparator;

public class MyPQ {
    ArrayList<MyEntry> list;
    Comparator<MyEntry> comparator;


    MyPQ(Comparator comp){

    }
    MyPQ(int initialCapacity, Comparator comp){

    }


    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public MyEntry insert(Object k, Object v){
        MyEntry e = new MyEntry(k, v);
        list.add(e);
        return e;
    }
    public MyEntry removeMin(){
        return null;
    }
    public MyEntry min(){
        return null;
    }
}
