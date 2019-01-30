package org.andestech.learning.rfb19.g3;

/**
 * Hello world!
 *
 */
public class CreditApp
{
    public static void main( String[] args )
    {
        //Начинаем проверку

        //Создаем клиента
        Customer customer20Years = new Customer("Alexey", "Sergeev", 20, "Moscow");

        //Создаем Кредитный счет

        CreditAccount ca1 = CreditAccount.createCreditAccount(1, customer20Years, 10000, 1);

        //Проверим количество денег на счете
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Внесем 1000 и проверим количество денег
        ca1.putMoney(1000);
        System.out.println("balance + 1000");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Выведем 500 и проверим количество денег
        ca1.withdrawal(500);
        System.out.println("balance - 500");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Проверим лимиты на ввод и вывод
        //Ввнесем 2000000 и проверим количество денег
        ca1.putMoney(2000000);
        System.out.println("balance + 2000000");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Ввнесем 5 и проверим количество денег
        ca1.putMoney(5);
        System.out.println("balance + 5");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Выведем 600000 и проверим количество денег
        ca1.withdrawal(600000);
        System.out.println("balance - 600000");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Выведем 50 и проверим количество денег
        ca1.withdrawal(50);
        System.out.println("balance - 50");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Сейчас у нас 10500 на счете, попробуем вывести 10400
        ca1.withdrawal(10500);
        System.out.println("balance - 10400");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

        //Сейчас у нас 10500 на счете, попробуем ввести 990000
        ca1.putMoney(990000);
        System.out.println("balance + 990000");
        System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());


        //Проверим ограничения при создании кредитного счета
        CreditAccount ca2 = CreditAccount.createCreditAccount(2, customer20Years, 10000, 3);
        //Проверим количество денег на счете
        try {
            System.out.println("Alexey Sergeevitch second balance: " + ca2.getBalance());
        } catch (NullPointerException e) {
            System.out.println("Alexey Sergeevitch doesn't have second Credit account");
        }

        Customer customer14Years = new Customer("Vladimir", "Semenov", 14, "Moscow");
        CreditAccount ca3 = CreditAccount.createCreditAccount(2, customer14Years, 10000, 1);
        //Проверим количество денег на счете
        try {
            System.out.println("Vladimir Semenov balance: " + ca3.getBalance());
        } catch (NullPointerException e) {
            System.out.println("Vladimir Semenov doesn't have Credit account");
        }
    }
}
