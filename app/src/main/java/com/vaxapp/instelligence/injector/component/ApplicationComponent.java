package com.vaxapp.instelligence.injector.component;

import com.vaxapp.instelligence.injector.module.ApplicationModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

}
