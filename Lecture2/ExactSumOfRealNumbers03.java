package Lecture2;


import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        BigDecimal sum =  new BigDecimal(0);
        //  BigDecimal sum = new BigDecimal(value 0)

        for (int i = 0; i < num; i++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());

            sum = sum.add(currentNum);

        }
        System.out.println(sum);

    }
}
