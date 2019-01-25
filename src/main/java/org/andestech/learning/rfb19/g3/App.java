package org.andestech.learning.rfb19.g3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("MASHA", "IVANOVA", "MOSCOW", 31);
        customer.printinfo();

        Account crediitAccount = CrediitAccount.generateAccount(customer);
        System.out.println(crediitAccount.accountId);

        System.out.println(crediitAccount.ballance);
        crediitAccount.putMoney(500000);
        System.out.println(crediitAccount.ballance);
        crediitAccount.withdrawal(50000);
        System.out.println(crediitAccount.ballance);
    }
}
