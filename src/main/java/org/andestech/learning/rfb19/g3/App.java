package org.andestech.learning.rfb19.g3;


public class App
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Anna", "Lukicheva", 56, "Москва, Рогова, 7 к2");

        Account crediitAccount = CreditAccount.generateCreditAccount(445556,customer,9000);
        System.out.println("Account ID:" + crediitAccount.accountId);
        customer.printCustomerinfo();
        System.out.println("Balance: " + crediitAccount.balance);

        crediitAccount.putMoney(5000);
        System.out.println("Put money: " + crediitAccount.balance);
        crediitAccount.withdrawal(6000);
        System.out.println("Withdrawal:" + crediitAccount.balance);
    }
}
