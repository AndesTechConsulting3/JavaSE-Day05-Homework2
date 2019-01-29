package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {


    private static double WITHDRAWAL_MIN = 5000;
    private static double SUMMA_MIN = 10000;

    public static double ballance;
    public static int accountId;
    public static String customer;


    private CreditAccount(String customer, double ballance, int accountId) {
        super(customer, ballance, accountId);
        if (ballance < WITHDRAWAL_MIN) ;
        System.out.println(customer + " баланс меньше установленного лимита на счете" + accountId);
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
