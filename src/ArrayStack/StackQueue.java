package ArrayStack;

interface Queue {
    public int size();
    public boolean isEmpty();
    public char front();
    public void enqueue(char o);
    public char dequeue();
}   

public class StackQueue implements Queue {

    char[] arr;
    int f;
    int size;

    public StackQueue(){
        this.f=0;
        this.size=0;
        arr = new char[size];
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (size==0);
    }

    @Override
    public char front() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            return (Character) null;
        }
        return arr[f];
    }

    @Override
    public void enqueue(char o) {
        // TODO Auto-generated method stub
        if(size == arr.length){
            throw new IllegalStateException();
        }
        int en = (f+size)% arr.length;
        arr[en] = o;
        size++;
    }

    @Override
    public char dequeue() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            return (Character) null;
        }
        char ans = arr[f];
        arr[f]=(Character) null;
        f = (f+1)% arr.length;
        size--;
        return ans;
    }

    public static void main(String args[]){
        StackQueue Qu = new StackQueue();
        char[] word = {'a','b','c','d','e','f','g','h','y','j','k','l','m','n','o','p'};
        for(int i=0;i<5;i++){
            Qu.enqueue(word[i]);
        }
        Qu.dequeue();
        Qu.dequeue();
        Qu.dequeue();
        for(int i=5;i<8;i++){
            Qu.enqueue(word[i]);
        }
        Qu.dequeue();
        Qu.dequeue();
        Qu.dequeue();
        for(int i=8;i<13;i++){
            Qu.enqueue(word[i]);
        }
        Qu.dequeue();
        Qu.dequeue();
        Qu.dequeue();
        Qu.dequeue();
        Qu.dequeue();
        Qu.dequeue();
        for(int i =0; i<Qu.size; i++){
            Qu.dequeue();
        }
    }
}