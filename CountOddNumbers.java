package CountOddNumbers;
import java.util.Scanner;

public class CountOddNumbers {
    public static int Counter(int n){
        int count =0;
        for(int i =1; i<=n; i++){
            if(i%2!=0){

                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int res = Counter(n);
        System.out.println("The count of odd numbers: "+res);
    }

}