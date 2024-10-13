import java.util.logging.Level;
import java.util.logging.Logger;

class TryCatch{

    // private static final Logger LOGGER = LogManager.getLogger();
    // private static final Logger LOGGER = Logger.;
    static Logger logger = Logger.getLogger(TryCatch.class.getName());

    public static void main(String[] args) {
        int a = 10, b = 0;
        try{
            System.out.println(a/b);
        }catch(Exception e){
            // System.out.println("Error : " + e.getMessage());
        // logger.log(System.Logger.Level.ERROR, e.getMessage());
        logger.log(Level.SEVERE, e.toString());
        }
    }
}