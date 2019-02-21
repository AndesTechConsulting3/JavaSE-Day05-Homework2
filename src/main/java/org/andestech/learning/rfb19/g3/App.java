package org.andestech.learning.rfb19.g3;


public class App
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Anna", "Lukicheva", 34, "Москва, Рогова, 7 к2");

        Account creditAccount = CreditAccount.generateCreditAccount(445556,customer,9000);
        System.out.println("Account ID:" + creditAccount.accountId);
        customer.printCustomerinfo();
        System.out.println("Balance: " + creditAccount.balance);

        creditAccount.putMoney(5000);
        System.out.println("Put money: " + creditAccount.balance);
        creditAccount.withdrawal(6000);
        System.out.println("Withdrawal:" + creditAccount.balance);
    }
}
