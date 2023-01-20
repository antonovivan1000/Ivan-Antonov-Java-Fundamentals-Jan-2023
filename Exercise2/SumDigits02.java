package Exercise2;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;

        while (number > 0) {

            int currentDigit = number % 10;
            sumOfDigits = sumOfDigits + currentDigit;
            number = number / 10;

        }
        System.out.printf("%d", sumOfDigits);
    }
}
