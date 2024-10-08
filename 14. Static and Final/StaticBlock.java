

public class StaticBlock {

    static int staticInt;

    static{
        staticInt = 761;
        System.out.println("Block 1 " + staticInt);
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }

    static{
        staticInt = 167;
        System.out.println("Block 2 " + staticInt);
    }
    
}
