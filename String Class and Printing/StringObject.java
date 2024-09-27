public class StringObject {
    public static void main(String[] args) {
        /*
         * char c[] = { 'A', 'B', 'C', 'D' };
         * String str = new String(c);
         * 
         * byte b[] = { 65, 66, 67, 68 };
         * str = new String(b);
         * str = new String(c, 1, 2);
         * 
         * String str1 = "Java";
         * String str2 = "Java";
         * 
         * System.out.printf("Addresses of str1 and str2 are %s %s", str1, str2);
         */

        // Methods available for String Class

        String str = new String("netbeans");

        // Length
        System.out.printf("Length of str is : %d\n", str.length());

        // UpperCase and LowerCase

        String strUpperCase = str.toUpperCase();
        System.out.printf("To Uppercase str is : %s\n", strUpperCase);
        String strLowerCase = str.toLowerCase();
        System.out.printf("To Lowercase str is : %s\n", strLowerCase);

        // Trimming the String
        String strWithSpaces = new String("    Welcome    ");
        String strTrimmed = strWithSpaces.trim();
        System.out.printf("String with Space : %s\n", strWithSpaces);
        System.out.printf("Trimmed String : %s\n", strTrimmed);

        // Printing Sub String
        String subStringStr = strTrimmed.substring(5);
        System.out.printf("SubStringStr : %s\n", subStringStr);

        // Replace Method
        String replacedString = strTrimmed.replace("e", "o");
        System.out.printf("Replaced String : %s\n", replacedString);

        // Starts with
        System.out.printf("Starts With W : %b\n", strTrimmed.startsWith("W"));
        System.out.printf("Starts With M : %b\n", strTrimmed.startsWith("M"));

        // Char At
        System.out.printf("Char At Index 4 : %c\n", strTrimmed.charAt(4));

        // Index Of
        System.out.printf("Index of c : %d\n", strTrimmed.indexOf("c"));
        System.out.printf("Index of e from Starting point 4 : %d\n", strTrimmed.indexOf("e", 4)); // Starting point is 4

        // Last Index of
        System.out.printf("Last index of e : %d\n", strTrimmed.lastIndexOf("e"));
        System.out.printf("Last index of e Starting Point 4 : %d\n", strTrimmed.lastIndexOf("e", 4)); // Starting point
                                                                                                      // 4

        // Equals Method
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        System.out.printf("Using equals to method for str1 and str2 : %b\n", str1.equals(str2));
        System.out.printf("Using equals to method for str1 and str3 : %b\n", str1.equals(str3));
        System.out.printf("Using == operator for str1 and str2 : %b\n", (str1 == str2));
        System.out.printf("Using == operator for str1 and str3 : %b\n", (str1 == str3));

        // Equals Ignore Case Method
        String str4 = "JAVA";
        System.out.printf("Equals Ignore Case Method for java and JAVA : %b\n", str1.equalsIgnoreCase(str4));

        // Compare To method
        /*
         * This Method checks which string comes first according to the dictionary
         * 
         * The result is a negative integer if this String object lexicographically
         * precedes the argument string. The result is a positive integer if this String
         * object lexicographically follows the argument string. The result is zero if
         * the
         * strings are equal; compareTo returns 0
         * 
         */
        String python = "python";
        System.out.printf("Comparing java and python : %d\n", str1.compareTo(python));
        /* Here it gives -6 meaning java preceedes python in lexographical order */

        // Value of Method
        System.out.println(String.valueOf(179));

    }
}
