package com.vaxapp.igintelligence.injector.component;

import com.vaxapp.igintelligence.injector.module.ApplicationModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

}
