public class butterflypatter {
    
    public static void main(String[] args) {
        int n =5;
        char ch ='A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(ch+" ");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
   ch='D';
    for(int i=4; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print(ch+" ");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch--;
    }
}
}

