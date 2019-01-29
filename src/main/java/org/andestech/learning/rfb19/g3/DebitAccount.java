package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    private static double WITHDRAWAL_MIN = 50000;
    private static double SUMMA_MIN = 100000;
    private static double ballance;
    private static int accountId;
    private static String customer;


    public DebitAccount(String customer, int ballance, int accountId) {
        super(customer, ballance, accountId);
        if (ballance < WITHDRAWAL_MIN) {
            System.out.println(customer + " Создание счета невозможно " + accountId);
        }
    }


    @Override
    public double withdrawal(double summa) {
        if (ballance - summa > SUMMA_MIN) {
        }
        return summa;
    }

    @Override
    public double putMoney(double money) {
        if (ballance - money > WITHDRAWAL_MIN) {
        }
        return money;
    }


}
