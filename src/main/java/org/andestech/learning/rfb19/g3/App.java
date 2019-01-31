package org.andestech.learning.rfb19.g3;

public class App
{
    public static void main( String[] args )
    {

        Customer customer = new Customer("Sheldon","Cooper","USA, CA, Pasadena",34);
        //customer.printCustomerInfo();

        //Account account = new Account("12345678900987654321", 10500, "qazwsx1234");
        //account.printAccountInfo();
        Account acc = new Account() {
            //@Override
            public void withdrawal(double sum) {
            }
            //@Override
            public void putMoney(double sum) {
            }
        };

        //System.out.println(acc.printAccountInfoFull());
        //acc.printAccountInfo();
        System.out.println("-------------------------------------------");

        DebitAccount dbacc = new DebitAccount(customer, 13000, "qazwsx1234");
        dbacc.withdrawal(11000);
        dbacc.putMoney(1500);
        System.out.println(dbacc.PrintDebitAccount());

        System.out.println("-------------------------------------------");

        //CreditAccount cracc = new CreditAccount(customer, -1500, "tgbvfr3545");
        Account cracc = CreditAccount.getCreditAccount(customer, -1500, "tgbvfr3545");
        cracc.withdrawal(2500);
        cracc.putMoney(4150);
        System.out.println(cracc.printAccountInfoFull());

    }
}
