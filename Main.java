import models.ATM;
import services.ATMService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(0); // Initial balance
        ATMService atmService = new ATMService(atm);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    atmService.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    atmService.withdraw(withdraw);
                    break;
                case 3:
                    System.out.println("Current Balance: " + atmService.checkBalance());
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