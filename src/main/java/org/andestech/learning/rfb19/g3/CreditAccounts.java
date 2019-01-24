package org.andestech.learning.rfb19.g3;

public interface CreditAccounts {
}

interface Wd
{
    public void withdrawal(double sum);

}
interface Dep
{
    public void putMoney(double sum);
}

interface CrAcc extends Wd,Dep{}
