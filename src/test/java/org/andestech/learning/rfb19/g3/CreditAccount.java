package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {

    @Override
    void withDrawal() {

    }

    @Override
    void putMoney() {

    }

    private static int limitSniatie;
    private static int limitOstatok;
    private static int limitIzbitok;


    private CreditAccount() {
    }

    public CreditAccount createCreditAccount (boolean isGoodCreditStory, int age){
        if (isGoodCreditStory && (age <= 75 && age >= 18)){
            return new CreditAccount();
        } else return null;
    }



}
