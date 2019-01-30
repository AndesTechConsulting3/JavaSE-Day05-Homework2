package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    private int accountId;
    private Customer customer;
    private int balance;

    private static int MAX_WITHDRAWAL_LIMIT = 500000;
    private static int MIN_WITHDRAWAL_LIMIT = 100;

    private static int MAX_PUT_LIMIT = 1000000;
    private static int MIN_PUT_LIMIT = 10;

    private static int MAX_SUMM_ON_ACCOUNT = 1000000;
    private static int MIN_SUMM_OF_ACCOUNT = 100;


    public DebitAccount(int accountId, Customer customer, int balance) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
    }

    @Override
    public void withdrawal(int summ) {
        if (summ > MIN_WITHDRAWAL_LIMIT && summ < MAX_WITHDRAWAL_LIMIT && !checkMinLimit(balance - summ)) {
            balance -= summ;
        }
        return;
    }

    @Override
    public void putMoney(int summ) {
        if (summ > MIN_PUT_LIMIT && summ < MAX_PUT_LIMIT && !checkMaxLimit(balance + summ)) {
            balance += summ;
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean checkMaxLimit(int summ) {
        if (summ < MAX_SUMM_ON_ACCOUNT) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkMinLimit(int summ) {
        if (summ > MIN_SUMM_OF_ACCOUNT) {
            return false;
        } else {
            return true;
        }
    }
}
