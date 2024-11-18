class StudentRN {
    String rollNumber;
    static int studentCount = 1;

    StudentRN() {
        rollNumber = "UNIV-2020-" + String.format("%02d", studentCount);
        studentCount++;
    }

    public void getRollNumber() {
        System.out.println(rollNumber);
    }

}

public class StudentRollNumber {
    public static void main(String[] args) {
        StudentRN student1 = new StudentRN();
        student1.getRollNumber();
    }
}
