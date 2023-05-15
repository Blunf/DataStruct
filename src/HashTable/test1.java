package HashTable;

public class test1 {
    public static void main(String[] args){
        MyHashTable hashTable = new MyHashTable(13);

        hashTable.put("20230001", "Kim g");
        hashTable.put("20230002", "Lee m");
        hashTable.put("20230003", "Park z");
        hashTable.put("20230004", "Choi m");
        hashTable.put("20230005", "Lee h");
        hashTable.put("20230006", "kwun j");
        hashTable.put("20230007", "Han j");
        hashTable.put("20230008", "Hong m");
        hashTable.put("20230009", "Kim j");
        hashTable.put("20230010", "Hwang h");
        System.out.println("-----------");
        System.out.println(hashTable.size());
        System.out.println(hashTable.get("20230006"));
    }
}
