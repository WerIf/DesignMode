package com.library.lily.designmode.factory.SimplenessFactory;

import com.library.lily.designmode.factory.bean.Apple;
import com.library.lily.designmode.factory.bean.Banana;
import com.library.lily.designmode.factory.bean.Food;

public class SFoodFactory {
    /**
     *      简单工厂模式
     *  违背设计模式的开闭原则：对扩展开放，对修改封闭
     *  当需要添加一个累的时候，就需要对FoodFactory进行一次修改
     * @param index
     * @return
     */
    public static Food build(int index){
        Food food = null;
        switch (index){
            case 0:
                food= new Apple();
                break;
            case 1:
                food= new Banana();
                break;
        }
        return food;
    }
}
