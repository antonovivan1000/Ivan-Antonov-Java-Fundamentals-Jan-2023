package Exercise1;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        if (day.equals(("Friday"))) {
            if (typeGroup.equals("Students")) {
                price = 8.45;
                if (numberPeople >= 30) {
                    price = price * 0.85;
                }
            } else if (typeGroup.equals("Business")) {
                price = 10.90;
                if (numberPeople >= 100) {
                    price = price * numberPeople - price * (numberPeople - 10);
                }
            } else if (typeGroup.equals("Regular")) {
                price = 15;
                if (numberPeople >= 10 && numberPeople <= 20) {
                    price = price * 0.95;
                }
            }
        } else if (day.equals("Saturday")) {
            if (typeGroup.equals("Students")) {
                price = 9.80;
                if (numberPeople >= 30) {
                    price = price * 0.85;
                }
            } else if (typeGroup.equals("Business")) {
                price = 15.60;
                if (numberPeople >= 100) {
                    price = price * numberPeople - price * (numberPeople - 10);
                }
            } else if (typeGroup.equals("Regular")) {
                price = 20;
                if (numberPeople >= 10 && numberPeople <= 20) {
                    price = price * 0.95;
                }
            }


        } else if (day.equals("Sunday")) {
            if (typeGroup.equals("Students")) {
                price = 10.46;
                if (numberPeople >= 30) {
                    price = price * 0.85;
                }
            } else if (typeGroup.equals("Business")) {
                price = 16;
                if (numberPeople >= 100) {
                    price = price * numberPeople - price * (numberPeople - 10);
                }
            } else if (typeGroup.equals("Regular")) {
                price = 22.50;
                if (numberPeople >= 10 && numberPeople <= 20) {
                    price = price * 0.95;
                }
            }

        }
        System.out.printf("Total price: %.2f", price * numberPeople);
    }


}




