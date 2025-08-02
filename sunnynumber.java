

import java.util.Scanner;

public class sunnynumber {
    public static boolean sunny(int n){
        for(int i=1; i<n;i++){
            if(i*i == n+1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n =sc.nextInt();
        System.out.println(sunny(n)?"Sunny Number":"Not Sunny Number");

    }
}