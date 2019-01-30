package org.andestech.learning.rfb19.g3;

public class DebitApp {

    public static void main(String[] args) {

        //Начинаем проверку

        //Создаем клиента
        Customer customer = new Customer("Semen", "Varlamov", 35, "Omsk");

        //Создаем Дебитовый счет

        DebitAccount da1 = new DebitAccount(1, customer, 20000);

        //Проверим количество денег на счете
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Внесем 1000 и проверим количество денег
        da1.putMoney(1000);
        System.out.println("balance + 1000");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Выведем 500 и проверим количество денег
        da1.withdrawal(500);
        System.out.println("balance - 500");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Проверим лимиты на ввод и вывод
        //Ввнесем 2000000 и проверим количество денег
        da1.putMoney(2000000);
        System.out.println("balance + 2000000");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Ввнесем 5 и проверим количество денег
        da1.putMoney(5);
        System.out.println("balance + 5");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Выведем 600000 и проверим количество денег
        da1.withdrawal(600000);
        System.out.println("balance - 600000");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Выведем 50 и проверим количество денег
        da1.withdrawal(50);
        System.out.println("balance - 50");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Сейчас у нас 20500 на счете, попробуем вывести 20400
        da1.withdrawal(20500);
        System.out.println("balance - 20400");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Сейчас у нас 20500 на счете, попробуем ввести 990000
        da1.putMoney(990000);
        System.out.println("balance + 990000");
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

    }
}
