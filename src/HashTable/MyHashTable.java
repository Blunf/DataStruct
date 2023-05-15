package HashTable;
import java.util.ArrayList;
import java.lang.Math;

public class MyHashTable {
    private ArrayList<ArrayList<StudentInfo>> bucketArray;
    private int bucketCapacity;
    private float loadFactor;




    MyHashTable(int initialCapacity){
        bucketCapacity = initialCapacity;
        bucketArray = new ArrayList<>(bucketCapacity);
        for (int i = 0; i < bucketCapacity; i++) {
            bucketArray.add(new ArrayList<>(0));
        }
    }
    MyHashTable(int initialCapacity, float Factor){
        bucketCapacity = initialCapacity;
        loadFactor = Factor;
        bucketArray = new ArrayList<>(bucketCapacity);
        for (int i = 0; i < bucketCapacity; i++) {
            bucketArray.add(new ArrayList<>(0));
        }
    }




    private int hashFunc(String k) {
        int p=33;
        int hashValue=0;

        for(int i=0; i< k.length(); i++){
            char c = k.charAt(i);
            int t = Character.getNumericValue(c);
            hashValue = hashValue + t*(int)Math.pow(p, i);
        }
        hashValue = Math.abs(hashValue) % bucketCapacity;
        return hashValue;
    }




    private void rehash(int capacity){
        ArrayList<ArrayList<StudentInfo>> newBucketArray = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            newBucketArray.add(new ArrayList<>());
        }

        for(ArrayList<StudentInfo> bucket : bucketArray){
            for(StudentInfo student : bucket){
                int hashValue = hashFunc(student.getStudentID());
                newBucketArray.get(hashValue).add(student);
            }
        }

        System.out.println("rehash finished.");
        System.out.println("ArraySize: "+capacity);
        bucketArray = newBucketArray;
        bucketCapacity = capacity;
    }
    public float getLoadFactor(){
        return loadFactor;
    }
    public int size() {
        int k=0;
        for(int i=0; i<bucketCapacity; i++){
           k = k+ bucketArray.get(i).size();
        }
        return k;
    }

    public String get(String k) {
        for(StudentInfo std:bucketArray.get(hashFunc(k))){
            if(k.equals(std.getStudentID())){
                return std.getStudentName();
            }
        }
        return null;
    }

    public String put(String k, String v) {
        for(int i=0; i<bucketArray.get(hashFunc(k)).size();i++){
            if(bucketArray.get(hashFunc(k)).get(i).getStudentName().equals(v)){
                bucketArray.get(hashFunc(k)).get(i).setStudentID(k);
                bucketArray.get(hashFunc(k)).get(i).setStudentName(v);
                return k;
            }
        }
        bucketArray.get(hashFunc(k)).add(new StudentInfo(k,v));
        double w = size()/bucketCapacity;
        if (w >= loadFactor) {
            rehash(2 * bucketCapacity);
        }
        return null;
    }

    public String remove(String k) {
        for(int i=0; i<bucketArray.get(hashFunc(k)).size();i++){
            if(bucketArray.get(hashFunc(k)).get(i).getStudentID()==k){
                bucketArray.get(hashFunc(k)).remove(i);
                return k;
            }
        }
        return null;
    }
}
