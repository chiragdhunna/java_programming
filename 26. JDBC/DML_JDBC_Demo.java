import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DML_JDBC_Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:univ.db");

// Statement stm = con.createStatement();

// Inserting the value
// stm.execute("insert into dept values(60,'CHEM')");

// Deleting a value
// stm.execute("delete from dept where deptno>50");

// Updating a value
// stm.execute("update dept set dname='ML' where deptno=50");

// Inseting using prepated statement
PreparedStatement stm = con.prepareStatement("insert into students values (?,?,?,?)");
Scanner sc = new Scanner(System.in);
System.out.print("Enter student Data : ");
int rollNumber = sc.nextInt();
String name = sc.next();
String place = sc.next();
int deptNo = sc.nextInt();
stm.setInt(1,rollNumber);
stm.setString(2, name);
stm.setString(3, place);
stm.setInt(4, deptNo);
stm.executeUpdate();


        con.close(); 
        stm.close();
        sc.close();
    }
}
