package com.vaxapp.igintelligence.presentation;

import android.app.Application;
import com.vaxapp.igintelligence.injector.component.ApplicationComponent;
import com.vaxapp.igintelligence.injector.component.DaggerApplicationComponent;
import com.vaxapp.igintelligence.injector.module.ApplicationModule;

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
