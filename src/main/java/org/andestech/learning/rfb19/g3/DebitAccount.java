package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    private static int limitSniatie = 20000;
    private static int limitOstatok = 0;
    private static int limitIzbitok = 1000000;

    public DebitAccount(int balance, String account, Customer customer) {
        super(balance, account, customer);
    }

    @Override
    void withDrawal(int deltaBalance) {
        if (limitOstatok < balance - deltaBalance) {
            if (limitSniatie > deltaBalance) {
                balance -= balance - deltaBalance;
                System.out.println("Текущий баланс счета: " + balance + " руб.");
            } else
                System.out.println("Операция невозможна! Лимит на снятие превышен на  " + (deltaBalance - limitSniatie) + " руб.");
        } else
            System.out.println("Операция невозможна! Остаток по счёту не должен быть меньше " + limitOstatok + " руб.");
    }


    @Override
    void putMoney(int deltaBalance) {
        if (limitIzbitok > balance + deltaBalance) {
            balance += deltaBalance;
            System.out.println("Текущий баланс счета: " + balance + " руб.");
        } else
            System.out.println("Операция невозможна! Текущий баланс счета превышен на " + ((balance + deltaBalance)- limitIzbitok ) + " руб.");
    }


}
