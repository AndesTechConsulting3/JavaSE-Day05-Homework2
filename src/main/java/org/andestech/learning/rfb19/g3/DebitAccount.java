package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    @Override
    public void putMoney(Integer Summ) {

        if (Summ >= MinPut && Summ <= MaxPutMax)this.balance += Summ;

    }

    @Override
    public void withdrawal(Integer Summa) {

        if (Summa >= MinWithdraw && Summa <= MaxWithdraw)this.balance -= Summa;
    }


}