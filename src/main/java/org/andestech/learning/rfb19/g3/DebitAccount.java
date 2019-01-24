package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    double s = 100;

    @Override
    public void withdrawal(double sum) {
        setBalance(s);
        setBalance(getBalance() - sum);
        System.out.println("Before bal: " + s +
                " Withdraw: -" + sum +
                " After operation bal: " + getBalance());
        }

    @Override
    public void putMoney(double sum) {
        setBalance(s);
        setBalance(getBalance() + sum);
        System.out.println("Before bal: " + s +
                " Deposit: " + sum +
                " After operation bal: " + getBalance());
    }
}