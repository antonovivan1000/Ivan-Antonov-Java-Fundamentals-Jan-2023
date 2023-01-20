package Exercise1;

import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sumFactorial = 0;
        while (number > 0) {
            int lastDigit = (number % 10);
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            sumFactorial = sumFactorial + factorial;
            number = number / 10;
        }
        if (sumFactorial == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}