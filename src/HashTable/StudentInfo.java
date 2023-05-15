package HashTable;

public class StudentInfo{
    private String studentID;
    private String studentName;

    public StudentInfo(String k, String v) {
        this.studentID =k;
        this.studentName=v;
    }
    public void setStudentID(String id){
        this.studentID = id;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
    public String getStudentID(){
        return studentID;
    }
    public String getStudentName(){
        return studentName;
    }
}