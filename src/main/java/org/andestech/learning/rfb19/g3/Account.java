package org.andestech.learning.rfb19.g3;

abstract class Account {

    private static int minBal=0;
    private static int maxBal=100000;
    public int balance;
    public String account;
    Customer customer;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(maxBal < balance || minBal > balance){
            System.out.println("Balance error");
        } else this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    private String getAccountinfo(){
        String accountInfo = "Account info:\n" +
                "Account: " + getAccount() +
                "\nBalance: " + getBalance() +
                "\nCustomer's info:\n" + customer.getCustomerInfo();
        return accountInfo;
    }

    public void printAccountInfo(){
        System.out.println(getAccountinfo());
    }

    public Account(int balance, String account, Customer customer) {
        this.account = account;
        this.customer = customer;
        if(maxBal < balance || minBal > balance){
            System.out.println("Balance error");
        } else this.balance = balance;
    }

    abstract void withDrawal(int deltaBalance);

    abstract void putMoney(int deltaBalance);

}
