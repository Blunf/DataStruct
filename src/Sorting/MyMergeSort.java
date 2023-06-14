package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyMergeSort {
    private ArrayList<ArrayList> L1;
    private ArrayList<ArrayList> L2;
    private Comparator comp;

    MyMergeSort(Comparator c) {
        L1 = new ArrayList<>();
        L2 = new ArrayList<>();
        comp = c;
    }
    

    public void sort(ArrayList l){
        if(l.size()==1){return;}

        for(int i=0; i<l.size(); i++){ //처음 L1에 각 요소를 리스트로 설정 
            ArrayList list = new ArrayList<Object>();
            list.add(l.get(i));
            L1.add(list);
        }

        this.merge();

        if(L1.size()==1){
            System.out.println(L1+"  >>  L1");
        }
        else{
            System.out.println(L2+"  >>  L2");
        }
    }

    public Comparator setComparator(Comparator c){ 
        this.comp = c;
        return c;
    }

    public void merge(){ //L1에 하나씩 저장되어 있는 상태로 시작 >> 리스트 안 요소의 개수가 1이 될 때 까지 l1과 l2 반복
        while(true){
            //L1 -> L2
            if(L1.size()==1){
                return;
            }
            L2.clear();
            for(int i=0; i<L1.size(); i+=2){
                ArrayList mergedList = new ArrayList<>(L1.get(i));
                if(i + 1 < L1.size()){
                    mergedList.addAll(L1.get(i+1));
                }
                Collections.sort(mergedList, Comparator.naturalOrder());
                L2.add(mergedList);
        }

            //L2->L1
            if(L2.size()==1){
                return;
            }
            L1.clear();
            for(int i=0; i<L2.size(); i+=2){
                ArrayList mergedList = new ArrayList<>(L2.get(i));
                if(i + 1 < L2.size()){
                    mergedList.addAll(L2.get(i+1));
                }
                Collections.sort(mergedList, Comparator.naturalOrder());
                L1.add(mergedList);
        }
        }
    }
}