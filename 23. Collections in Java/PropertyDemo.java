import java.io.*;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        // Setting Properties

        /*
         * p.setProperty("Brand", "Dell");
         * p.setProperty("Processor", "i7");
         * p.setProperty("OS", "Windows");
         * p.setProperty("Model", "Latitude");
         */

        // Storing data in a .txt file
        /*
         * p.store(new FileOutputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in
         * Java/PropertiesDataDemo.txt"),
         * "Laptop Details");
         */

        // Storing data in a .xml file
        /*
         * p.storeToXML(new FileOutputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in
         * Java/PropertiesDataXMLDemo.xml"),
         * "Laptop Details");
         */

        // Fetching Data from .xml file

        /*
         * p.loadFromXML(new FileInputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in
         * Java/PropertiesDataXMLDemo.xml"));
         * 
         * System.out.println(p);
         */

        // Fetching data from txt file
        p.load(new FileInputStream(
                "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in Java/PropertiesDataDemo.txt"));
        System.out.println(p.getProperty("Brand"));
    }
}
