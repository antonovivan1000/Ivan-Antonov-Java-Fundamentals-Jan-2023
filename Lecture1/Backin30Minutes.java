package Lecture1;

import java.util.Scanner;

public class Backin30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeMinutes = (hours * 60) + minutes + 30;

        int returnHours = timeMinutes / 60;
        int returnMinutes = timeMinutes % 60;

        if (returnHours > 23) {
            returnHours = 0;
        }
        System.out.printf("%d:%02d", returnHours, returnMinutes);


    }
}
