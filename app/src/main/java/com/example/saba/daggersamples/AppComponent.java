package com.example.saba.daggersamples;

import android.app.Application;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AppModule.class,
        AndroidSupportInjectionModule.class,
        ActivityBindingModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(final Application app);

        AppComponent build();
    }

    void inject (App app);

    @Override
    void inject(DaggerApplication instance);

}
