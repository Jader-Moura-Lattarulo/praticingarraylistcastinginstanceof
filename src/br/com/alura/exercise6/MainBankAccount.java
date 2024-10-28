package br.com.alura.exercise6;

import java.util.ArrayList;

public class MainBankAccount {
    public static void main(String[] args) {

    RandomBalance randomBalance = new RandomBalance();

    BankAccount ba01 = new BankAccount(1234, randomBalance.randomDouble());
    BankAccount ba02 = new BankAccount(2345, randomBalance.randomDouble());
    BankAccount ba03 = new BankAccount(3456, randomBalance.randomDouble());
    BankAccount ba04 = new BankAccount(4567, randomBalance.randomDouble());
    BankAccount ba05 = new BankAccount(5678, randomBalance.randomDouble());
    BankAccount ba06 = new BankAccount(6789, randomBalance.randomDouble());
    BankAccount ba07 = new BankAccount(7890, randomBalance.randomDouble());
    BankAccount ba08 = new BankAccount(9870, randomBalance.randomDouble());
    BankAccount ba09 = new BankAccount(9876, randomBalance.randomDouble());
    BankAccount ba10 = new BankAccount(8765, randomBalance.randomDouble());
    BankAccount ba11 = new BankAccount(7654, randomBalance.randomDouble());
    BankAccount ba12 = new BankAccount(6543, randomBalance.randomDouble());
    BankAccount ba13 = new BankAccount(5432, randomBalance.randomDouble());
    BankAccount ba14 = new BankAccount(4321, randomBalance.randomDouble());

    ArrayList<BankAccount> bankAccountArrayList = new ArrayList<>();

    bankAccountArrayList.add(ba01);
    bankAccountArrayList.add(ba02);
    bankAccountArrayList.add(ba03);
    bankAccountArrayList.add(ba04);
    bankAccountArrayList.add(ba05);
    bankAccountArrayList.add(ba06);
    bankAccountArrayList.add(ba07);
    bankAccountArrayList.add(ba08);
    bankAccountArrayList.add(ba09);
    bankAccountArrayList.add(ba10);
    bankAccountArrayList.add(ba11);
    bankAccountArrayList.add(ba12);
    bankAccountArrayList.add(ba13);
    bankAccountArrayList.add(ba14);

    BankAccount highestBalanceAccount = null;
    double highestBalance = 0;

    for ( BankAccount bankAccount : bankAccountArrayList ){
        if (highestBalance < bankAccount.getBalance()) {
            highestBalance = bankAccount.getBalance();
            highestBalanceAccount = bankAccount;
        }
    }
        System.out.println(highestBalanceAccount);
    }
}

