public class Pattern2 {
    public static void main(String[] args) {
        
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
        System.out.println();
        
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d ",counter);
                counter++;
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
