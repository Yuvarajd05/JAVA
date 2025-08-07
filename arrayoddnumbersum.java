import java.util.Scanner;

public class arrayoddnumbersum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
   System.out.println("Enter the array size");
   int [] arr = new int[(sc.nextInt())];
   System.out.println("Enter the elements of array");
   for(int i =0;i<arr.length;i++){
    arr[i]= sc.nextInt();
   }
   int  count =0;
   int sum=0;
    for(int i=0;i<arr.length;i++){
        if(i%2!=0){
            sum+=arr[i];
       count++;
        }
    }
       System.out.println("The sum of odd numbers " +sum);    
        }
    }


