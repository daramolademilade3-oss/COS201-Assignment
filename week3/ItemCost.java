/*
 * Student Name: Oluwademilade Daramola olaoluwakiitan
 * Matriculation Number: 25/18007
 * Programme: Computer Science
 * Course: COS 201 — Computer Programming I
 */

import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();
        
        System.out.print("Enter the price per item: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        
        double subtotal = price * quantity;
        double taxRate = 0.075; // 7.5% Tax
        double taxAmount = subtotal * taxRate;
        double totalCost = subtotal + taxAmount;
        
        System.out.println("\n--- Receipt Summary ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (7.5%): $" + taxAmount);
        System.out.println("Total Cost: $" + totalCost);
        
        scanner.close();
    }
}
