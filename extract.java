
import java.util.Scanner;

public class extract {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int n =sc. nextInt();
        while(n!=0){
           int m = n%10;
            System.out.println(m);
            n=n/10;
        }

    }
    
}
