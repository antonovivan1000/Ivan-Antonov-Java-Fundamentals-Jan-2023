package Lecture2;

import java.util.Scanner;

public class PoundsToDollars02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.36;

        System.out.printf("%.3f", dollars);

    }
}
