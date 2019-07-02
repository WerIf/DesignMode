package com.library.lily.designmode.factory.AbastactFactory;

public class EatApple implements EatFactory {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
