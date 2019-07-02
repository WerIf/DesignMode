package com.library.lily.designmode.factory.AbastactFactory;

public class PayBanana implements PayFactory {
    @Override
    public void pay() {
        System.out.println("买香蕉");
    }
}
