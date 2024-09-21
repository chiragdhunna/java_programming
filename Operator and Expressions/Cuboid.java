import java.util.Scanner;

public class Cuboid {
    
    static int totalArea(int l, int b, int h){
        return 2*((l*h) + (b*h) + (l*b));
    }

    static int volume(int l, int b, int h){
        return l*b*h;
    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int l = sc.nextInt();
        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();
        System.out.print("Enter the Height : ");
        int h = sc.nextInt();
        sc.close();

        System.out.println("Total Surface Area : " + totalArea(l, b, h));
        System.out.println("Volume is : "+ volume(l, b, h));
    }
}
