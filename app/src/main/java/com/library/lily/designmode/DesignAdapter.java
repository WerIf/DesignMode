package com.library.lily.designmode;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DesignAdapter extends RecyclerView.Adapter<DesignAdapter.ViewHolder> {

    private final String[] datas;
    private Context context;

    private ClickItem onClickItemListener;

    public void setOnClickItemListener(ClickItem onClickItemListener) {
        this.onClickItemListener = onClickItemListener;
    }

    public DesignAdapter(String[] datas){
        this.datas=datas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context=viewGroup.getContext();
        View view=LayoutInflater.from(context).inflate(R.layout.layout_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        viewHolder.itemText.setText(datas[i]);

        viewHolder.itemText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickItemListener.onClickItemListener(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView itemText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemText=itemView.findViewById(R.id.itemText);
        }
    }

    public interface ClickItem{
        void onClickItemListener(int position);
    }
}
