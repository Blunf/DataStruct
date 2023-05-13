package Basic;


//push, pop, top, size, isEmpty

public class MyStack {
    MyArrayList<Integer> list = new MyArrayList<Integer>();

    void push(int n)throws IndexOutOfBoundsException{
        list.add(list.size-1, n);
    }

    int pop()throws IndexOutOfBoundsException{
        if(list.isEmpty()){
            System.out.println("empty");
            return (Integer) null;
        }
        return list.remove(list.size-1);
    }

    int top(){
        return list.get(list.size-1);
    }

    int size(){
        return list.size();
    }

    boolean isEmpty(){
        if(list.size()==0){
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
        MyStack stack = new MyStack();
        
        for(int i =1; i<11; i++){
            stack.push(i);
        }
        stack.pop();
        stack.print();
        for(int i =0; i<stack.size(); i++){
            stack.pop();
        }
        stack.print();
    }
}


