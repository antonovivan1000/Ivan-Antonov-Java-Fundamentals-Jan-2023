package Exercise1;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        double totalInputMoney = 0;
        double productPrice = 0;
        while (!input.equals("Start")) {

            double inputCoins = Double.parseDouble(input);

            if (inputCoins == 0.1 || inputCoins == 0.2 || inputCoins == 0.5 || inputCoins == 1 || inputCoins == 2) {

                totalInputMoney = totalInputMoney + inputCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputCoins);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            boolean hasMoney = true;
            switch (product) {
                case "Nuts":
                    if (totalInputMoney < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalInputMoney -= 2;
                    }
                    break;
                case "Water":
                    if (totalInputMoney < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalInputMoney -= 0.7;
                    }
                    break;
                case "Crisps":
                    if (totalInputMoney < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalInputMoney -= 1.5;
                    }
                    break;
                case "Soda":
                    if (totalInputMoney < 0.8) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalInputMoney -= 0.8;
                    }

                    break;
                case "Coke":
                    if (totalInputMoney < 1) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalInputMoney -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if (!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);


            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalInputMoney);
    }
}


