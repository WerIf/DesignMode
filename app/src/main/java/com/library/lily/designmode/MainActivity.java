package com.library.lily.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.library.lily.designmode.factory.FactoryMode;

public class MainActivity extends AppCompatActivity implements DesignAdapter.ClickItem {

    String[] lists={"工厂模式","装饰者模式"};

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        DesignAdapter adapter=new DesignAdapter(lists);
        adapter.setOnClickItemListener(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }

    @Override
    public void onClickItemListener(int position) {
        switch (position){
            case 0:
                FactoryMode.start(this);
                break;
            case 1:
                break;
        }
    }
}
