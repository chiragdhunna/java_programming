import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDL_JDBC_Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:univ.db");
        Statement stm = con.createStatement();
        
        // Creating a table
        // stm.executeUpdate("create table Temp(a integer, b float)");


        // Droping a table
        stm.executeUpdate("drop table Temp");

        stm.close();
        con.close();
    }
}
