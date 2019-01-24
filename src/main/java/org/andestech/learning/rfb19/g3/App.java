package org.andestech.learning.rfb19.g3;

public class App
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Sheldon","Cooper","USA, CA, Pasadena",34);
        customer.printCustomerInfo();

        //Account account = new Account("12345678900987654321", 10500, "qazwsx1234");
        //account.printAccountInfo();

        DebitAccount daccount = new DebitAccount();
        daccount.withdrawal(10);
        daccount.putMoney(25);

    }
}
