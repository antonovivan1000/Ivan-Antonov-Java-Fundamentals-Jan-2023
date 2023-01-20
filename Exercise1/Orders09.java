package Exercise1;

import java.util.Scanner;

public class Orders09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double totalOrdersPrice = 0;

        for (int i = 1; i <= orders; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleAmount = Integer.parseInt(scanner.nextLine());
            double totalPricePerOrder = ((days * capsuleAmount) * capsulePrice);
            System.out.printf("The price for the coffee is: $%.2f%n", totalPricePerOrder);
            totalOrdersPrice = totalOrdersPrice + totalPricePerOrder;
        }

        System.out.printf("Total: $%.2f", totalOrdersPrice);
    }
}