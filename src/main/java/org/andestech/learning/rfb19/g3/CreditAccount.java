package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {
//public class CreditAccount implements CrAcc{

    double bb = 0;
    public static int minBal=-5000, maxBal=15000, minW=0, maxW=10000, minD=0, maxD=15000;

    public CreditAccount(Customer customer, double balance, String accountId) {
        super(customer, balance, accountId);
        if(balance >= minBal && balance <= maxBal ) this.balance = balance;
        else System.out.println("Account opening failed!");
    }

    //double s = 100;

    @Override
    public void withdrawal(double sum) {
        //setBalance(s);
        if(balance >= minBal && balance <= maxBal )
        {   if ((balance - sum) >= minBal)
        { if (sum > minW && sum < maxW) {
            bb = getBalance();
            setBalance(bb - sum);
            System.out.println(
                    "Before bal: " + bb +
                            " Withdraw: -" + sum +
                            " After operation bal: " + getBalance());
        }
        else System.out.println("Sum exceeds limits " + minW + " < " + sum + " < " + maxW);}
        else System.out.println("Withdrawal " + sum + " > your balance " + balance);}
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

    public String PrintCreditAccount(){return "Name: " + customer.getFirstName() + ", \nSurname: " + customer.getSecondName() +
            ", \nAddress: " + customer.getAddress() + ", \nWhat's My Age Again? " + customer.getAge() +
            ", \nAccountId: " + accountId + ", \nBalance: " + balance;}

}
