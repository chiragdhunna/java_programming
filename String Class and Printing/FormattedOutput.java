

public class FormattedOutput {
    public static void main(String[] args) {
    int x = 10;
    int y = -10;
    float z = 123.4582923f;
    char c = 'a';
    String str = "Hello Java Ji";


    /*
     
        Format Specifiers 

        %[argument_index$][flags][width][.precision]conversion

        argument_index - 1$ , 2$ , 3$ , .....

        flag '-' , '+' , '0' , '', '('

        conversion - 
        char   c
        int    d,o,x  [Decimal, Octal, Hexadecimal]
        float  f,e,g  [Float , Scientic ...]
        String s


     */

     // Conversion
    System.out.printf("Hello Ji %d %g %c\n",x,z,c);

    // Argument Index
    System.out.printf("Hello %1$d %1$d 1$d\n",x);

    // Width
    System.out.printf("Hello Ji %15d\n",x);

    // Flag

    // 0 as Flag
    System.out.printf("0 as Flag : %015d\n",x);
    
    // + as Flag
    System.out.printf("+ As Flag in Positive Number : %+15d\n",x);
    System.out.printf("+ As Flag in Negative Number : %+15d\n",y);
    
    // ( as Flag
    System.out.printf("( as Flag in Positive Number %(15d\n",x);
    System.out.printf("( as Flag in Negative Number %(15d\n",y);

    // - as Flag
    System.out.printf("With - in String : %-25s\n",str);
    System.out.printf("Without - in String : %25s\n",str);

    // Using . in Decimal Value
    System.out.printf(" Formatting Decimal Numbers : %6.2f",z);
    /*
     If the Number before decimal was more than 6, then it will show all those numbers and won't limit it.
     But if it was less, it would add spacess in the remaing space
     */
    }
}
