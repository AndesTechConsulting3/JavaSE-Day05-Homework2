package org.andestech.learning.rfb19.g3;

public abstract class Account {

    protected static final int MinWithdraw=1000, MaxWithdraw=10000;
    protected static final int MinPut=1000, MaxPutMax=20000;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer accountId;
    public double balance ;
    Customer customer;

    public Account(Integer accountId, Customer customer, double balance) {
        this.balance = balance;
        this.customer = customer;
        this.accountId = accountId;
    }

    public abstract void withdrawal(double Summ);
    public abstract void putMoney(double Summ);

//    private String getAccountInfо(){
//        return
//                "Account Id: " + accountId +  ", " + "Customer: " + customer.getCustomerInfо() + ", " +
//                        "Balance: " + balance;
//    }
//
//    public void printCustomerinfo()
//    {
//        System.out.println(getAccountInfо());
//
//    }
}