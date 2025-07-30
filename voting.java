import java.util.Scanner;
public class voting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

      System.out.println("What is the age");
      int age = sc.nextInt();

      if(age>=18){
      System.out.println("Eligible");
    } else{
        System.out.println("not eligble");
    }
    }
}