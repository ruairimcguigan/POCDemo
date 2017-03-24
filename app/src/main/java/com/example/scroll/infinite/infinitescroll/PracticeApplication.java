package com.example.scroll.infinite.infinitescroll;

import android.app.Application;

import com.example.scroll.infinite.infinitescroll.dagger.ApplicationComponent;
import com.example.scroll.infinite.infinitescroll.dagger.ApplicationModule;
import com.jakewharton.threetenabp.AndroidThreeTen;

import timber.log.Timber;

/**
 * Application class will act as a container for the AppComponent
 */

public class PracticeApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        Timber.d("Pre dependencies set up");


        Timber.d("Init AndroidThreeTen");

        AndroidThreeTen.init(this);


        component = DaggerApplicationComponent.builder()
                // list of modules that are part of this component need to be created here too
                .applicationModule(new ApplicationModule(this)) // This also corresponds to the name of your module: %component_name%Module
                .build();

        Timber.d("Post dependencies set up");
    }

    // Application component accessor
    public ApplicationComponent getApplicationComponent(){
        return component;
    }
}
