package com.example.scroll.infinite.infinitescroll.dagger;

import android.content.Context;

import com.example.scroll.infinite.infinitescroll.PracticeApplication;

import org.joda.money.format.MoneyFormatter;
import org.joda.money.format.MoneyFormatterBuilder;
import org.threeten.bp.format.DateTimeFormatter;

import java.util.Locale;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    PracticeApplication application;

    public ApplicationModule(PracticeApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext(){
        return application;
    }

    @Provides
    @Singleton
    public DateTimeFormatter provideDateTimeFormatter(){
        return DateTimeFormatter.ofPattern("dd MM yyyy").withLocale(Locale.ENGLISH);
    }

    @Provides
    @Singleton
    public MoneyFormatter provideMoneyFormatter(){
        return new MoneyFormatterBuilder()
                .appendCurrencySymbolLocalized()
                .appendAmountLocalized()
                .toFormatter()
                .withLocale(Locale.ENGLISH);
    }
}
