package com.library.lily.designmode.factory;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.library.lily.designmode.R;
import com.library.lily.designmode.factory.AbastactFactory.EatApple;
import com.library.lily.designmode.factory.AbastactFactory.EatBanana;
import com.library.lily.designmode.factory.AbastactFactory.EatFactory;
import com.library.lily.designmode.factory.AbastactFactory.PayApple;
import com.library.lily.designmode.factory.AbastactFactory.PayBanana;
import com.library.lily.designmode.factory.AbastactFactory.PayFactory;
import com.library.lily.designmode.factory.MethodFactory.AppleFactory;
import com.library.lily.designmode.factory.MethodFactory.BananaFactory;
import com.library.lily.designmode.factory.MethodFactory.MFoodFactory;
import com.library.lily.designmode.factory.SimplenessFactory.SFoodFactory;

import java.lang.ref.WeakReference;

public class FactoryMode extends AppCompatActivity {

    public static void start(Context context){
        WeakReference<Context> weakReference=new WeakReference<Context>(context);
        Intent intent=new Intent();
        intent.setClass(context,FactoryMode.class);
        weakReference.get().startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_mode);


    }


    /**
     *  简单工厂
     *  通过传入不同的值 并根据值 生成不同的对象
     * @param view
     */
    public void simplenessFc(View view) {

        SFoodFactory.build(0);
    }

    /**
     * 工厂方法 ，抽象工厂 都是在简单工厂之上 根据设计模式的开闭原则进行的优化
     *  优点：
     *      对扩展开放，对修改封闭
     *  缺点：
     *      会增聚Class文件的数量
     *
     *  工厂方法 抽象工厂的区别：
     *      工厂方法的特点是对扩展对象 当添加一个类时 只需要增加两个类(一个Food的实例，一个Food的创建工厂的实例)，
     *      但是当需要给Food接口添加一个属性时  发现Food的所有实现子类都需要修改 修改变动十分的大
     *      这个时候 抽象工厂出现了  抽象工厂主要是针对对象的属性 当需要增加Food基类的属性 只需要添加一个类 从而达到目的
     *
     *      当属性相对稳定，变动不大时：推荐使用工厂方法 反之推荐使用抽象工厂
     *
     */

    /**
     *  工厂方法
     *
     * @param view
     */
    public void methodFc(View view) {
        MFoodFactory foodFactory=new AppleFactory();

        MFoodFactory foodFactory1=new BananaFactory();
    }

    /**
     *  抽象工厂
     * @param view
     */
    public void abstractFc(View view) {
        EatFactory eatApple=new EatApple();
        EatFactory eatBanana=new EatBanana();

        PayFactory payApple=new PayApple();
        PayFactory payBanana=new PayBanana();
    }
}
