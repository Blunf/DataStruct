package ArrayStack;

import java.util.EmptyStackException;
import java.util.Scanner;

interface Stack{
    public int size();
    public boolean isEmpty();
    public char top();
    public char push(char o);
    public char pop();

}

public class ArrayStack implements Stack {

    private static final Exception EmptyStackException = null;
    int t;
    int size;
    char arr[];

    public ArrayStack(int size){
        t=-1;
        this.size = size;
        arr = new char[this.size];
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return(t == -1);
    }

    @Override
    public char top() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return arr[t];
        }
    }

    @Override
    public char push(char o) {
        // TODO Auto-generated method stub
        if(!isEmpty()){
            return (Character) null;
        }
        else{
            return arr[t++] = o;
        }
    }

    @Override
    public char pop() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return arr[t--];
        }
    }
    // ArrayStack 클래스 구현

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("입력하세요");
        String input = sc.nextLine();

        ArrayStack stack = new ArrayStack(input.length());

        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            stack.push(c);
        }

        for(int i = 0; i<stack.size(); i++){
            System.out.println(stack.pop());
        }
    }




    
    
}

