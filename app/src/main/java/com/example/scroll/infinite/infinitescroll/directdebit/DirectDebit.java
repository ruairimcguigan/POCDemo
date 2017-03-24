package com.example.scroll.infinite.infinitescroll.directdebit;

import com.example.scroll.infinite.infinitescroll.Item;

import org.joda.money.Money;
import org.threeten.bp.LocalDate;

/**
 * Created by c0249298 on 23/03/2017.
 */

public class DirectDebit extends Item {

    private String id, debitName;
    private LocalDate lastPaid;
    private Money debitAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getLastPaid() {
        return lastPaid;
    }

    public void setLastPaid(LocalDate lastPaid) {
        this.lastPaid = lastPaid;
    }

    public String getDebitName() {
        return debitName;
    }

    public void setDebitName(String directDebitName) {
        debitName = directDebitName;
    }

    public Money getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Money directDebitAmount) {
        debitAmount = directDebitAmount;
    }

}
