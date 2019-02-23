package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    //double s = 100;
    private double bb = 0;
    private static final int minBal=0, maxBal=15000, minW=0, maxW=10000, minD=0, maxD=15000;

    @Override
    public void withdrawal(double sum) {
        //setBalance(s);
        if(balance >= minBal && balance <= maxBal)
        {   if (sum < balance)                     //все три условия необходимы
            { if (sum > minW && sum < maxW) {
                bb = getBalance();
                setBalance(bb - sum);
                System.out.println(
                        "Before bal: " + bb +
                                " Withdraw: -" + sum +
                                " After operation bal: " + getBalance());
            }
        else System.out.println("Sum exceeds limits " + minW + " < " + sum + " < " + maxW);}
        else System.out.println("Withdrawal " + sum + " > than your balance " + balance);}
        else System.out.println("Incorrect balance! " + balance);
        }

    @Override
    public void putMoney(double sum) {
        //setBalance(s);
        if(balance >= minBal && balance <= maxBal )
        { if (sum > minD && sum + balance < maxD) {
            bb = getBalance();
            setBalance(bb + sum);
            System.out.println(
                    "Before bal: " + bb +
                            " Deposit: " + sum +
                            " After operation bal: " + getBalance());
        }
        else System.out.println("Sum exceeds limits " + minD + " < " + (sum+balance) + " < " + maxD);}
        else System.out.println("Incorrect balance! " + balance);
    }

    public DebitAccount(Customer customer, double balance, String accountId
            //, double s
    ) {
        //super(customer, balance, accountId);
        //this.s = s;
        this.balance = balance;
        this.accountId = accountId;
        this.customer = customer;
    }

    public String PrintDebitAccount(){return "Name: " + customer.getFirstName() + ", \nSurname: " + customer.getSecondName() +
            ", \nAddress: " + customer.getAddress() + ", \nWhat's My Age Again? " + customer.getAge() +
            ", \nAccountId: " + accountId + ", \nBalance: " + balance;}

//    public DebitAccount(double s) {
//        this.s = s;
//    }
}