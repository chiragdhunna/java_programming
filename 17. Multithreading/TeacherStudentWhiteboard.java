class Teacher extends Thread{
    WhiteBoard whiteBoard;

    public Teacher(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run(){
        String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
        for(String note : notes){
            whiteBoard.write(note);
        }
    }
    
}

class Student extends Thread{
    WhiteBoard whiteBoard;
    String name;

    public Student(WhiteBoard whiteBoard, String name) {
        this.whiteBoard = whiteBoard;
        this.name = name;
    }

    @Override
    public void run(){
        String text;
        whiteBoard.attendance();

        do { 
            text = whiteBoard.read();
            System.out.println(name + " reading " + text);
            System.out.flush();
        } while (!text.equals("end"));
    }
}

class WhiteBoard {
    String text;
    int numberOfStudents = 0;
    int counter = 0;
    
    synchronized  public void write(String msg){
        System.out.println("Teahcer is writing " + msg);
        while(counter!=0)
            try{wait();}catch(Exception e){}
        
        text = msg;
        counter = numberOfStudents;
        notifyAll();
    }

    synchronized public String read(){

        while(counter==0)
            try{wait();}catch(Exception e){}

        counter--;
        if(counter==0)
            notify();
        return text;
    }
    
    public void attendance(){
        numberOfStudents++;
    }
}

public class TeacherStudentWhiteboard {
    public static void main(String[] args) {
        WhiteBoard whiteBoard = new WhiteBoard();
        Student chirag = new Student(whiteBoard,"1. Chirag");
        Student atul = new Student(whiteBoard,"2. Atul");
        Student ayush = new Student(whiteBoard,"3. Ayush");
        Student arpit = new Student(whiteBoard,"4. Arpit");
        Teacher teacher = new Teacher(whiteBoard);
        teacher.start();
        chirag.start();
        arpit.start();
        atul.start();
        ayush.start();
    }    
}
