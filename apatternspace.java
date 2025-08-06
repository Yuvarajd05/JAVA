public class apatternspace {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("A  ");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("   ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("A  ");
            }
            System.out.println();
        }
    }
}


