
package services;

import models.ATM;

public class ATMService {
    private ATM atm;

    public ATMService(ATM atm) {
        this.atm = atm;
    }

    public void deposit(double amount) {
        atm.deposit(amount);
    }

    public void withdraw(double amount) {
        atm.withdraw(amount);
    }

    public double checkBalance() {
        return atm.getBalance();
    }
}
