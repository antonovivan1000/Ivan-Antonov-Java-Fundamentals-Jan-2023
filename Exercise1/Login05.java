package Exercise1;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        // System.out.println(username.length());
        //  System.out.println(username.charAt(0));
        // System.out.println(username.charAt(username.length() - 1));


        for (int i = (username.length() - 1); i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }
        String inputPass = scanner.nextLine();
        int counter = 0;
        while (!inputPass.equals(password)) {

            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            inputPass = scanner.nextLine();
        }
        if (inputPass.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}