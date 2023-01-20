package Exercise2;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factorExhaust = Integer.parseInt(scanner.nextLine());

        int startingPower = power;
        int countTarget = 0;

        while (power > distance) {
            power -= distance;
            countTarget++;

            if (power == startingPower / 2) {
                if (factorExhaust != 0) {
                    power = power / factorExhaust;
                }
            }

        }
        System.out.println(power);
        System.out.println(countTarget);
    }
}
