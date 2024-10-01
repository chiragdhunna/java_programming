public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j+i>n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int counter = 1;
        int space = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=counter; j++){
                System.out.print("*");
            }
            System.out.println();
            counter+=2;
            space--;
        }
    }
}
