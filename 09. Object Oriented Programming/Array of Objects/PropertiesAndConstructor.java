class Subject {
    private String subjectId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    Subject() {
        this.maxMarks = 100;
    }

    Subject(String subjectId, String name, int marksObtained) {
        this.subjectId = subjectId;
        this.name = name;
        this.marksObtained = marksObtained;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public String getName() {
        return name;
    }

    public String getSubjectId() {
        return subjectId;
    }
}

public class PropertiesAndConstructor {
    public static void main(String[] args) {
        Subject sb1 = new Subject("CSE", "Chirag", 30);
        Subject sb2 = new Subject("CSE", "John", 40);
        Subject sb3 = new Subject("CSE", "Jay", 50);
        Subject sb4 = new Subject("CSE", "Sidney", 60);
        Subject sb5 = new Subject("CSE", "Junjan", 20);
        Subject[] subjects = { sb1, sb2, sb3, sb4, sb5 };
        for (Subject s : subjects) {
            System.out.println(s.getName());
        }
    }
}
