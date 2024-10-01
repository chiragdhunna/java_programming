
public class DisplayNumberInWords {
    static String numToString(int num){
        switch (num) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
        
            default:
                return "Invalid";
        }
    }    

    public static void main(String[] args) {
        int n = 1700;
        String str = "";
        while(n>9){
            str = str.concat(numToString(n%10) + " ");
            n = n/10;
        }
        str = str.concat(numToString(n%10) + " ");

        String[] words = str.split(" ");
        int i = words.length - 1;
        System.out.println("");
        while(i>=0){
            System.out.print(words[i]+" ");
            i--;
        }
        System.out.println("");
    }
}
