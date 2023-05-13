package Entry;

import java.util.Comparator;

public class IntComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        if(o1.getClass().getName().equals("java.lang.Integer") && o2.getClass().getName().equals("java.lang.Integer")){
            return ((int)o1-(int)o2);
        }
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
    
    public static void main(String[] str){
        IntComparator c = new IntComparator();
        MyPQ pq = new MyPQ(c);

        pq.insert((int)30, null);
        pq.insert((int)10, null);
        pq.insert((int)20, null);   
        
        System.out.println((Integer)pq.removeMin().getKey());
        System.out.println((Integer)pq.removeMin().getKey());
        System.out.println((Integer)pq.removeMin().getKey());
    }
}