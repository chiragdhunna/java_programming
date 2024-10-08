public class FinalMembers {
    

    
    public static void main(String[] args) {
        final int MINI = Integer.MAX_VALUE;

        /*
        Not Allowed 
        static{
            MINI = 10;
        }
    
        */

        System.out.println(MINI);
    }
}
