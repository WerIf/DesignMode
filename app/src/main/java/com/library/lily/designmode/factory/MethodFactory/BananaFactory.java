package com.library.lily.designmode.factory.MethodFactory;

import com.library.lily.designmode.factory.bean.Banana;
import com.library.lily.designmode.factory.bean.Food;

public class BananaFactory implements MFoodFactory {
    @Override
    public Food InstanceFactory() {
        return new Banana();
    }
}
