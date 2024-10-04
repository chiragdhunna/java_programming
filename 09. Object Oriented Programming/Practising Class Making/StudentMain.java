class Student {
    public int rollNumber;
    public String name;
    public String course;
    public int marks1, marks2, marks3;

    Student() {
        this.name = "Chirag";
        this.rollNumber = 18;
        this.course = "CSE";
        this.marks1 = 30;
        this.marks2 = 40;
        this.marks3 = 50;
    }

    Student(String name, int rollNumber, String course, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void totalMarks() {
        System.out.println("Total marks is : " + (marks1 + marks2 + marks3));
    }

    public void average() {
        System.out.println("Average is : " + (float) ((marks1 + marks2 + marks3) / 3));
    }

    public String toString() {
        return "Name : " + this.name + "\nRoll Number : " + this.rollNumber + "\nCourse : " + this.course
                + "\nMarks 1 : " + this.marks1 + "\nMarks 2 : " + this.marks2 + "\nMarks 3 : " + this.marks3;
    }

    public void grade() {
        int average = (marks1 + marks2 + marks3) / 3;
        if (average >= 90) {
            System.out.println("A+");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else if (average >= 50) {
            System.out.println("E");
        } else if (average >= 40) {
            System.out.println("F");
        } else {
            System.out.println("Failed");
        }
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Ajay", 1001, "Mechanical", 30, 40, 10);
        System.out.println(student);
    }
}
