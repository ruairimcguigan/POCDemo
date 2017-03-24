package com.example.scroll.infinite.infinitescroll.dagger;

import com.example.scroll.infinite.infinitescroll.DirectDebitListActivity;
import com.example.scroll.infinite.infinitescroll.PracticeApplication;
import com.example.scroll.infinite.infinitescroll.directdebit.DirectDebitAdapter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Instruct where things are to be injected
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(PracticeApplication target);

    void inject(DirectDebitListActivity target);

    void injectDirectDebitAdpter(DirectDebitAdapter target);
}
