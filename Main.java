package ATMApp;

import ATMApp.Models.ATMOperations;
import ATMApp.Models.ATM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMOperations atm = new ATM(1000); // Initial balance
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    atm.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    atm.withdraw(withdraw);
                    break;
                case 3:
                    System.out.println("Current Balance: " + atm.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
