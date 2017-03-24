package com.example.scroll.infinite.infinitescroll.directdebit;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.scroll.infinite.infinitescroll.R;

import org.joda.money.format.MoneyFormatter;
import org.threeten.bp.format.DateTimeFormatter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DirectDebitViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.dd_name)
    TextView directDebitName;

    @BindView(R.id.dd_amount)
    TextView directDebitAmount;

    @BindView(R.id.dd_last_paid)
    TextView directDebitLastPaid;


    public DirectDebitViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void populate(DirectDebit directDebit, MoneyFormatter moneyFormatter, DateTimeFormatter dateTimeFormatter){
        directDebitName.setText(directDebit.debitName);
        setDirectDebitAmount(directDebit, moneyFormatter);
        setDirectDebitLastPaid(directDebit, dateTimeFormatter);
    }

    private void setDirectDebitAmount(DirectDebit directDebit, MoneyFormatter moneyFormatter) {
        String amountString = "-";
        if (directDebit.getDebitAmount() != null) {
            amountString = moneyFormatter.print(directDebit.getDebitAmount());
        }

        directDebitAmount.setText(amountString);
    }

    private void setDirectDebitLastPaid(DirectDebit directDebit, DateTimeFormatter dateTimeFormatter){
        String lastPaid = "Never";
        if (directDebit.getLastPaid() != null){
            lastPaid = dateTimeFormatter.format(directDebit.getLastPaid());
        }

        directDebitLastPaid.setText(lastPaid);
    }
}
