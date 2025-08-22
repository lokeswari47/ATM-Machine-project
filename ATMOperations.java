package ATMApp.Models;

public interface ATMOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
