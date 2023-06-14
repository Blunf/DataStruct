package Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList<>();
        Random random = new Random();
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        MyMergeSort mg = new MyMergeSort(c);

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }

        System.out.println("Before: "+numbers);
        System.out.print("After: ");
        mg.sort(numbers);

    }
}
