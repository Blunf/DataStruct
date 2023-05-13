package Basic;

import java.time.Year;

interface List<E>{
    int size();

    boolean isEmpty();

    E get(int i) throws IndexOutOfBoundsException;

    E set(int i, E e) throws IndexOutOfBoundsException;

    void add(int i, E e)throws IndexOutOfBoundsException;

    E remove(int i) throws IndexOutOfBoundsException;
}

class MyArrayList<E> implements List<E>{

    E[] arr;
    int capacity = 0;
    int size = 0;
    int DEFAULT_CAPACITY = 10;

    MyArrayList(){
        this.arr = (E[])new Object[DEFAULT_CAPACITY];
    }
    MyArrayList(int capacity){
        this.arr=(E[])new Object[capacity];
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size==0;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        return arr[i];
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        E temp = arr[i];
        arr[i] = e;
        return temp;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        //4번에 추가하면 나머지는 뒤로이동 
        for(int k = size-1; k>=i;k--){
            arr[k+1] = arr[k];
        }
        arr[i]=e;
        size++;
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        //4번에 제거하면 나머지들이 빈자리 채움 
        E temp = arr[i];
        for(int k=i; k<size-1; k++){
            arr[k]=arr[k+1];
        }
        arr[size-1]=null;
        size--;
        return temp;
    }
}