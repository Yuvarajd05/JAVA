import java.util.*;
public class primeenumber{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
    int count = 0;
    for(int i=1;i<=n;i++){
        if (n%i==0){
            count++;
        }
    }
if(count==2){
    System.out.println("it is prime number");
}else{
    System.out.println("it is not");
}
}    
}

