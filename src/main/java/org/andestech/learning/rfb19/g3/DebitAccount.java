package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class DebitAccount extends Account {

    private static double WITHDRAWAL_MIN = 50000;
    private static double SUMMA_MIN = 10000;
    private static double WITHDRAWAL_MAX = 400000;
    private static double SUMMA_MAX = 300000;
    private static int MAX_AGE = 65;
    private static int MIN_AGE = 18;

    private static double ballance;
    private static int accountId;
    private static String customer;
    private static int age;


    public DebitAccount(String customer, int ballance, int accountId) {
        super(customer, ballance, accountId);
        if (ballance > WITHDRAWAL_MIN && ballance < WITHDRAWAL_MAX) {
            System.out.println(customer + " Thanks you operation approved " + accountId);
        } else {
            System.out.println("Sorry operation access denided");
        }
    }


    @Override
    public double withdrawal(double summa) {
        if (ballance - summa > SUMMA_MIN && ballance - summa < SUMMA_MAX) {
            System.out.println(customer + " Create operation approved " + " your account " + accountId );
        } else {
            System.out.println("Sorry operation denided");
        }
        return summa;
    }

    @Override
    public double putMoney(double money) {
        if (ballance - money > WITHDRAWAL_MIN && ballance - money < WITHDRAWAL_MAX) {
            System.out.println(customer + "Create operation approved");
        } else {
            System.out.println("Sorry operation denided");
        }
        return money;
    }

}
