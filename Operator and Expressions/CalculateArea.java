import java.util.Scanner;

class CalculateArea{
    
    int areaOfRightAngledTriangle(int height, int breadth){
        return (breadth*height)/2;
    }

   static double areaOfAnyTriangle(int a, int b, int c){
        
        double s = (a+b+c)/2.0;
        
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide First Side of the Triangle : ");
        int a = sc.nextInt();
        System.out.println("");
        System.out.print("Provide Second Side of the Triangle : ");
        int b = sc.nextInt();
        System.out.println("");
        System.out.print("Provide Third Side of the Triangle : ");
        int c = sc.nextInt();
        System.out.println("");
        System.out.println("Area of your triangle is : " + areaOfAnyTriangle(a,b,c));
        sc.close();
    }

}