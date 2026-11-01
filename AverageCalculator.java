/*
 * Student Name: Oluwademilade Daramola olaoluwakiitan
 * Matriculation Number: 25/18007
 * Programme: Computer Science
 * Course: COS 201 — Computer Programming I
 */

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.class.cast(System.in == null ? null : System.in));
        
        System.out.print("How many numbers do you want to find the average of? ");
        int count = scanner.nextInt();
        
        if (count <= 0) {
            System.out.println("Please enter a valid count greater than 0.");
            scanner.close();
            return;
        }
        
        double sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextDouble();
        }
        
        double average = sum / count;
        System.out.println("The average of the " + count + " numbers is: " + average);
        
        scanner.close();
    }
}
