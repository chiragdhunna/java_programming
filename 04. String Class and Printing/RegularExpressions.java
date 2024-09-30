/*  Here in Regular Expressions we will check if the string given 
matches a particular pattern or not. 
*/

public class RegularExpressions {
    public static void main(String[] args) {

        // #################### The below methods are only for single alphabets
        // #####################

        // --------------- Matching Symbols

        // . is used to check if the String contains only single letter or character
        // or symbol

        String str1 = "f";
        System.out.println(str1.matches("."));

        // [abc] is used to check if the String contains only the characters
        // a or b or c
        String str2 = "abkk";
        System.out.println(str2.matches("[abc]"));

        // [^abc] is used to check if the String do not contain any of the characters
        // a or b or c
        String str3 = "p";
        System.out.println(str3.matches("[^abc]"));

        // [a-z] is used to check range of characters
        String str4 = "a";
        System.out.println(str4.matches("[a-z]"));

        // abc is used to check exact string
        String str5 = "abc";
        System.out.println(str5.matches("abc"));

        // ----------------- Meta Charactes

        // \w is used to check if the strings contains a single Alphabet or Number
        String str6 = "a";
        System.out.println(str6.matches("\\w"));

        // \W is opposite of \w
        System.out.println(str6.matches("\\W"));

        // \d is for digits
        System.out.println(str6.matches("\\d"));

        // \D is opposite of \d
        System.out.println(str6.matches("\\D"));

        // \s is for space
        System.out.println(" ".matches("\\s"));

        // \S is opposite of \s
        System.out.println(" ".matches("\\S"));

        // ---------------- Quantifiers

        // * -- > 0 or more times
        System.out.println("abc".matches("[abc]*"));

        // + -- > One or more time
        System.out.println("abc".matches("[abc]*"));

        // ? -- > 0 or 1 time
        System.out.println("aabbb".matches("[ab]?"));

        // {X} -- > X times [Total letters to be X]
        System.out.println("aabbb".matches("[ab]{1}"));

        // {X,Y} -- > Between X and Y times [Total letters between X and Y]
        System.out.println("aabbb".matches("[ab]{1,5}"));

    }
}
