package com.library.lily.designmode.factory.AbastactFactory;

public class PayApple implements PayFactory {
    @Override
    public void pay() {
        System.out.println("买苹果");
    }
}
