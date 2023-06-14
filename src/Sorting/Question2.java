package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Question2 {
    public static void main(String[] args) {
        String sentence = "In computer science, a data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.";

        String[] words = sentence.replaceAll("[.,]", "").split(" ");
        System.out.println(sentence);

        
        ArrayList<String> WD = new ArrayList<>(Arrays.asList(words));

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        MyMergeSort MG = new MyMergeSort(c);

        MG.sort(WD);
    }
}