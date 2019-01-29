package org.andestech.learning.rfb19.g3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        DebitAccount debitAccount = new DebitAccount("FFFF", 40000, 316465246);
        debitAccount.putMoney(100);
        debitAccount.withdrawal(200);
    }
}
