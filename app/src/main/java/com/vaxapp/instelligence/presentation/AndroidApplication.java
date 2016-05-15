package com.vaxapp.instelligence.presentation;

import android.app.Application;
import com.vaxapp.instelligence.injector.component.ApplicationComponent;
import com.vaxapp.instelligence.injector.component.DaggerApplicationComponent;
import com.vaxapp.instelligence.injector.module.ApplicationModule;

public class AndroidApplication extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
