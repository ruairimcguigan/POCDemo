package com.example.scroll.infinite.infinitescroll.directdebit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.scroll.infinite.infinitescroll.BaseAdapter;
import com.example.scroll.infinite.infinitescroll.R;

import org.joda.money.format.MoneyFormatter;
import org.threeten.bp.format.DateTimeFormatter;

import javax.inject.Inject;


public class DirectDebitAdapter extends BaseAdapter<DirectDebit, DirectDebitViewHolder> {

    private Context context;

    @Inject
    DateTimeFormatter dateTimeFormatter;

    @Inject
    MoneyFormatter moneyFormatter;

     public DirectDebitAdapter(Context context) {
        this.context = context;
    }

    @Override
    public DirectDebitViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.rc_item_view, parent, false);

        DirectDebitViewHolder viewHolder = new DirectDebitViewHolder(view);

        // todo OnClickListener may be needed
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onItemClicked(holder.getAdapterPosition());
//            }
//        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DirectDebitViewHolder holder, int position) {

        DirectDebit directDebit = (DirectDebit) getItem(position);

        // TODO: 24/03/2017 Inject date and money formatter dependencies
        holder.populate(directDebit, moneyFormatter, dateTimeFormatter);

    }

}
