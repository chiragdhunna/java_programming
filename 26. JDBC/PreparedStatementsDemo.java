import java.sql.*;
import java.util.Scanner;

public class PreparedStatementsDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:univ.db");
        Scanner sc;
        try (PreparedStatement stm = con.prepareStatement("select * from students where deptno=?")) {
            sc = new Scanner(System.in);
            System.out.println("Enter  Dept Number ");
            int dno = sc.nextInt();
            stm.setInt(1, dno);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("roll") + " " + rs.getString("name") + " " + rs.getString("city") + " " + rs.getInt(4) + " "
                );
            }
        }
        sc.close();
    }
}
