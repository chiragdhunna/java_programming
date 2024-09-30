public class SwappingNumbersWithBitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        System.out.println("a before is : " +a + " and b before is : " + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a after is : " +a + " and b after is : " + b);
    }
}
