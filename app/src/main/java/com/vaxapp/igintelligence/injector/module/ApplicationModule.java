package com.vaxapp.igintelligence.injector.module;

import com.vaxapp.igintelligence.presentation.AndroidApplication;
import dagger.Module;

@Module
public class ApplicationModule {

    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }
}
