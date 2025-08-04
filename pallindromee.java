import java.util.*;
public class pallindromee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int n=151;
    int org=n;
    int rev =0;
    while(n!=0){
int rem= n%10;
rev=rev*10+rem;
n=n/10;
    }
    
if (rev==org){
    System.out.println("it is pallindrome ");
}else{
    System.out.println("it is not ");
}
}
}