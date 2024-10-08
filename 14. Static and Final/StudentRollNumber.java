class Student{
    String rollNumber;
    static int studentCount = 1;

    Student(){
        rollNumber = "UNIV-2020-"+String.format("%02d",studentCount);
        studentCount++;
    }

    public void getRollNumber(){
        System.out.println(rollNumber);
    }

}

public class StudentRollNumber {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.getRollNumber();
    }
}
