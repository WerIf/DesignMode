package com.library.lily.designmode.factory.MethodFactory;

import com.library.lily.designmode.factory.bean.Apple;
import com.library.lily.designmode.factory.bean.Food;

public class AppleFactory implements MFoodFactory {
    @Override
    public Food InstanceFactory() {
        return new Apple();
    }
}
