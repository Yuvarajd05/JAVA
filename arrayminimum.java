import java.util.Scanner;

public class arrayminimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0]; // Start with first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum value is: " + min);
    }
}


