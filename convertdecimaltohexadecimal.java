import java.util.Scanner;
public class convertdecitobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=56;
        String binary =" ";
        while(n!=0){
            {
                binary =(n%2)+binary;
                n=n/2;
            }
            System.out.println(binary);
        }
    }
}
