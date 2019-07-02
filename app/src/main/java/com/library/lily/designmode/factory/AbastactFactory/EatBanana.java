package com.library.lily.designmode.factory.AbastactFactory;

public class EatBanana implements EatFactory {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
