package org.andestech.learning.rfb19.g3;

abstract class Account {

public Customer customer;
public int balance;
public String accountId;

    abstract void withDrawal(int deltaBalance);

    abstract void putMoney(int deltaBalance);

}
