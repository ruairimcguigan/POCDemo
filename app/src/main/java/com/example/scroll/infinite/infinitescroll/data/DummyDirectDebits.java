package com.example.scroll.infinite.infinitescroll.data;

import com.example.scroll.infinite.infinitescroll.directdebit.DirectDebit;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.threeten.bp.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class DummyDirectDebits {

    private static List<DirectDebit> directDebits = new ArrayList<>();

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("1");
        directDebit.setDebitName("Pure gym membership");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 130.40));
        directDebit.setLastPaid(LocalDate.now().minusDays(1));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("2");
        directDebit.setDebitName("Fierce Grace membership");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 30.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(5));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("3");
        directDebit.setDebitName("Fierce Grace membership");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 30.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(5));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("4");
        directDebit.setDebitName("Northern rail monthly");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 50.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(2));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("5");
        directDebit.setDebitName("Virgin Media");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 20.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(10));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("6");
        directDebit.setDebitName("Broadband");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 100.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(1));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("7");
        directDebit.setDebitName("Vodafone");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 550.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(9));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("8");
        directDebit.setDebitName("Xtravision");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 10.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(9));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("9");
        directDebit.setDebitName("Age of Empires");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 200.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(9));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("10");
        directDebit.setDebitName("Office Supplies");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 250.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(9));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("11");
        directDebit.setDebitName("Empire Earth");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 25.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(0));
        directDebits.add(directDebit);
    }

    static {
        DirectDebit directDebit = new DirectDebit();
        directDebit.setId("12");
        directDebit.setDebitName("Empire Earth 2");
        directDebit.setDebitAmount(Money.of(CurrencyUnit.GBP, 25.00));
        directDebit.setLastPaid(LocalDate.now().minusDays(0));
        directDebits.add(directDebit);
    }

    public static List<DirectDebit> get() {
        return directDebits;
    }
}
