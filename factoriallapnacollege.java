import java.util.Scanner;

public class factoriallapnacollege {
    public static void printfactorial(int n){
        int factorial =1;
        if(n<0){
            System.out.println("invalid");
            return;
        }
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        
    }
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printfactorial(n);

        }

    }

    

