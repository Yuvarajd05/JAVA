

import java.util.Scanner;

public class car {
    Scanner sc = new Scanner(System.in);
    int millage;
    int price;
    void driver(){
        System.out.println("Driver name: ");
        String name = sc.next();
        System.out.println("Driver Name: "+name);
    }
    void travel(){
        System.out.println("Place name: ");
        String place = sc.next();
        System.out.println("Travel: "+place);
    }

    public static void main(String[] args) {
        car A = new car();
        A.millage=65;
        A.price=3000;
        System.out.println("Millage: "+A.millage);
        System.out.println("Price: "+A.price);
        A.driver();
        A.travel();
    }

}