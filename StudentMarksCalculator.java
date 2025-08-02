import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks in Biology: ");
        int biology = scanner.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks in Computer Science: ");
        int cs = scanner.nextInt();

        
        int total = physics + chemistry + biology + math + cs;
        double percentage = total / 5.0;

    
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

    
        System.out.println("\n----- Result -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}