package org.andestech.learning.rfb19.g3;


public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Anna", "Lukicheva", 56, "Москва, Рогова, 7 к2");
        customer.printCustomerinfo();

        Account crediitAccount = CreditAccount.generateAccount(customer);
        System.out.println(crediitAccount.accountId);

        System.out.println(crediitAccount.balance);
        crediitAccount.putMoney(500000);
        System.out.println(crediitAccount.balance);
        crediitAccount.withdrawal(50000);
        System.out.println(crediitAccount.balance);
    }
}
