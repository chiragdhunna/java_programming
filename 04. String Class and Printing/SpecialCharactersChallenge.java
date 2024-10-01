/*
 * 1. Remove Special Characters from a String
 * 2. Remove Extra Spaces from a String
 * 3. Find number of words in a String
 * 
 */

public class SpecialCharactersChallenge {
    public static void main(String[] args) {
        String str = "a!B@C#1#2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        String str1 = "        abc   de     fgh     ijk   ";
        System.out.println(str1.replaceAll("\\s+", " ").trim());

        // Number of words
        System.out.println("Number of words in str1 : " + str1.replaceAll("\\s+", " ").trim().split("\\s").length);
    }
}
