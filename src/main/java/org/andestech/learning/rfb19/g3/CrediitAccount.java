package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class CrediitAccount extends Account {

    protected static final int AgeMin=22, AgeMax=98;
    @Override
    public void putMoney(int Summ) {
        if (Summ >= PutMin && Summ <= PutMax)this.ballance += Summ;
        else System.out.println("вышkи за границы");
    }

    @Override
    public void withdrawal(int Summa) {
        if (Summa >= WithdrawMin && Summa <= WithdrawMax && Summa<=this.ballance)this.ballance -= Summa;
        else System.out.println("вышли за границы");
    }

    public CrediitAccount() {
        this.accountId = new Random().nextInt();
    }

    public static Account generateAccount(Customer customer){

        if (customer.age<= AgeMin || customer.age> AgeMax) try {
            throw new Exception("Клиент не подходит");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CrediitAccount();
    }
}
