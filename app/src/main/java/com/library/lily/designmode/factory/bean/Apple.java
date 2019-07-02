package com.library.lily.designmode.factory.bean;


public class Apple implements Food {
    @Override
    public void eat() {
      System.out.println("吃苹果");
    }

    @Override
    public void pay() {
        System.out.println("买苹果");
    }
}
