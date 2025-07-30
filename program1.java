
import java.util.Scanner;

 class program1
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.printl("Enter Salary");
    int Salary = sc.nextInt();

    int bonus = salary/10;
    salary = salary+bonus;

    System.out.println("Final Salary:" salary);
    sc.close();
}
}