package com.vaxapp.instelligence.injector.module;

import com.vaxapp.instelligence.presentation.AndroidApplication;
import dagger.Module;

@Module
public class ApplicationModule {

    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }
}
