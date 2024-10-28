package br.com.alura.exercise6;

public class BankAccount {
    private final int accountNumber;
    private final double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return String.format("Número de conta: %d\nSaldo: R$%.2f", accountNumber, balance);
    }
}
