package Basic;


//push, pop, top, size, isEmpty

public class MyDequeue {
    MyArrayList<Integer> list = new MyArrayList<Integer>();
    int size;

    void enqueue(int i)throws IndexOutOfBoundsException{
        for(int k=list.size-1; k>=0; k--){
            int temp = list.get(k);
            list.add(k+1, temp);
        }
        list.add(0, i);
    }

    void dequeue(int i)throws IndexOutOfBoundsException{
        list.add(list.size, i);
    }

    int front(){
        return list.get(0);
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }

    void print(){
        if(list.size==0){
            System.out.println("모두 비었습니다.");
        }
        for(int i =0; i<list.size; i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String args[]){
        MyDequeue de = new MyDequeue();
        for(int i =1; i<11; i++){
            de.enqueue(i);
        }
        for(int i =1; i<11; i++){
            de.dequeue(i);
        }
        de.print();
    }
}


