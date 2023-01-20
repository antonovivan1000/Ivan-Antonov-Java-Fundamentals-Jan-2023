package Lecture2;

import java.util.Scanner;

public class ConcatNames05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = String.format("%s%s%s%n", firstName, delimiter, secondName);

        System.out.print(result);


    }
}
