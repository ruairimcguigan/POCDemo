package com.example.scroll.infinite.infinitescroll;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c0249298 on 24/03/2017.
 */

public abstract class BaseAdapter <I extends Item, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V>{

    List<I> dataList;

    public BaseAdapter() {
        dataList = new ArrayList<>();
    }

    public void setData(List<I> data) {
        this.dataList = data;

        if (hasObservers()) {
            notifyDataSetChanged();
        }
    }

    public Object getItem(int position){
        return dataList.get(position);
    }

    protected void clearData() {
        dataList.clear();
    }

    @Override
    public int getItemCount() {
        return (dataList == null) ? 0 : dataList.size();
    }
}
