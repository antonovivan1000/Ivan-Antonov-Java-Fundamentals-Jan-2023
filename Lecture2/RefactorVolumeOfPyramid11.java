package Lecture2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RefactorVolumeOfPyramid11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double widht = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double volume = (length * widht * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);


    }
}

