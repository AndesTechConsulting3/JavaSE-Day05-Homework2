package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class CreditAccount extends Account {

    protected static final int AgeMin=18, AgeMax=91;
    @Override
    public void putMoney(Integer Summ) {
        if (Summ >= MinPut && Summ <= MaxPutMax)this.balance += Summ;
        else System.out.println("вышли за границы");
    }

    @Override
    public void withdrawal(Integer Summa) {
        if (Summa >= MinWithdraw && Summa <= MaxWithdraw && Summa<=this.balance)this.balance -= Summa;
        else System.out.println("вышли за границы");
    }

    public CreditAccount() {
        this.accountId = new Random().nextInt();
    }

    public static Account generateAccount(Customer customer){

        if (customer.age<= AgeMin || customer.age> AgeMax) try {
            throw new Exception("Клиент не подходит");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CreditAccount();
    }
}

