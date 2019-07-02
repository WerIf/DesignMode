package com.library.lily.designmode.factory.bean;

public class Banana implements Food {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }

    @Override
    public void pay() {
        System.out.println("买香蕉");
    }
}
