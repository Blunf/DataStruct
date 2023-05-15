package HashTable;

//실행 확인을 위한 클래스입니다.

public class supertest {
    public static void main(String[] args){
        MyHashTable Table = new MyHashTable(13);

        String nin = "2024";
        System.out.println(nin.length());

        Table.put("2023", "apple");
        System.out.println(Table.get("2023"));
    }
}
