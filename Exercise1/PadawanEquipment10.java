package Exercise1;

import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        double totalLightsabers = priceLightsabers * Math.ceil(students * 1.1);
        int freeBelts = students / 6;
        double totalBelts = priceBelts * (students - freeBelts);
        double totalRobes = students * priceRobes;

        double totalCost = (totalLightsabers + totalRobes + totalBelts);


        if (availableMoney >= totalCost) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalCost - availableMoney);


        }
    }
}
