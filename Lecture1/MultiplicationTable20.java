package Lecture1;

import java.util.Scanner;

public class MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        int multiply = 0;
        for (int i = multiplier; i <= 10; i++) {

            multiply = number * i;


            System.out.printf("%d X %d = %d%n", number, i, multiply);


        }
        if (multiplier > 10) {
            multiply = number * multiplier;

            System.out.printf("%d X %d = %d", number, multiplier, multiply);

        }

    }
}

