/*
 * MarkAndGrade Project
 * --------------------
 * - Accepts a grade input between 0 and 100
 * - Maps grade to marks: A, B, C, D, E, or FAIL
 * - Handles invalid input (greater than 100 or negative values)
 * - Allows multiple inputs until user chooses to exit
 */
import java.util.Scanner;

public class MarkAndGrade {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter your grade (Grade must be between 0 and 100) : ");
                float grade = in.nextFloat();
                if (grade > 100) {
                    System.out.println("Invalid input, grade cannot be greater than 100.");
                } else if (grade >= 90 && grade <= 100) {
                    System.out.println("Your mark is : A ");
                } else if (grade >= 80) {
                    System.out.println("Your mark is : B ");
                } else if (grade >= 70) {
                    System.out.println("Your mark is : C ");
                } else if (grade >= 60) {
                    System.out.println("Your mark is : D ");
                } else if (grade >= 50) {
                    System.out.println("Your mark is : E ");
                } else if (grade >= 0) {
                    System.out.println("FAIL");
                } else {
                    System.out.println("Invalid input, grade cannot be negative");
                    break;
                }
                System.out.print("Do you want to continue? (y/n): ");
                char choice = in.next().charAt(0);

                if (choice == 'n' || choice == 'N') {
                    System.out.println("Exiting program... Thanks!");
                    break;
                }

            }
        }
    }
}
