public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        int i = 0, j= str.length() - 1;
        while(str.charAt(i) == str.charAt(j) && i<=j){
            i++;
            j--;
        }

        if(i>j){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
