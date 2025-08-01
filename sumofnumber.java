
import java.util.Scanner;

public class sumofnumber {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int n=2;
    int sum=0;
    int count=0;

    while(count<=10){
        sum =sum+n;
        n=n+2;
        count++;
    }
    System.out.println(sum);
}
}
