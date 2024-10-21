package com.common;

public interface Account {
    String getBalance(); //잔액

    String deposit(int money); //입금
    String withDraw(int money);//출금
}
