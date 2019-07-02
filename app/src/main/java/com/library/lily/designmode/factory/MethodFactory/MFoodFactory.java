package com.library.lily.designmode.factory.MethodFactory;

import com.library.lily.designmode.factory.bean.Food;

public interface MFoodFactory {
    /**
     *  工厂方法模式
     *  在简单工厂之上进行优化 对扩展开放
     *
     * @return
     */
    Food InstanceFactory();
}
