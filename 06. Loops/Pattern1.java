public class Pattern1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=5; i++){
            
            for(int j=1; j<=5; j++){
                System.out.print("("+i+","+i+")");
            }
            System.out.println();
        }
        
        System.out.println();

        for(int i=1; i<=5; i++){
            
            for(int j=1; j<=5; j++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        int counter = 1;
        for(int i=1; i<=5; i++){
            
            for(int j=1; j<=5; j++){
                System.out.printf("%02d ",counter);
                counter++;
            }
            System.out.println();
        }
    }
}
