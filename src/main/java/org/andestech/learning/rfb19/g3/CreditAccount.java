package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {

    private int accountId;
    private Customer customer;
    private int balance;

    private static int MIN_AGE = 18;
    private static int MAX_COUNT_OF_CREDITS = 1;

    private static int MAX_WITHDRAWAL_LIMIT = 500000;
    private static int MIN_WITHDRAWAL_LIMIT = 100;

    private static int MAX_PUT_LIMIT = 1000000;
    private static int MIN_PUT_LIMIT = 10;

    private static int MAX_SUMM_ON_ACCOUNT = 1000000;
    private static int MIN_SUMM_OF_ACCOUNT = 100;


    public static CreditAccount createCreditAccount (int accountId, Customer customer, int balance, int countOfCredits) {
        if (customer.getAge() >= MIN_AGE && countOfCredits <= MAX_COUNT_OF_CREDITS) {
            return new CreditAccount(accountId, customer, balance);
        }
        return null;
    }


    @Override
    public void withdrawal(int summ) {
        if (summ > MIN_WITHDRAWAL_LIMIT && summ < MAX_WITHDRAWAL_LIMIT && !checkMinLimit(balance - summ)) {
                balance -= summ;
        }
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

    private CreditAccount(int accountId, Customer customer, int balance) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
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
