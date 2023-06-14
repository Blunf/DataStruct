package Sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    
    public static void main(String[] args){
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        MyMergeSort mg = new MyMergeSort(c);
        ArrayList l = new ArrayList<>();
        l.add(7);
        l.add(2);
        l.add(9);
        l.add(4);
        l.add(3);
        l.add(8);
        l.add(6);
        l.add(1);

        mg.sort(l);
    }
}
