package com.amjadomari.mvpuserprofile.di.component;

import android.app.Application;
import android.content.Context;

import com.amjadomari.mvpuserprofile.UserProfileApplication;
import com.amjadomari.mvpuserprofile.data.DataManager;
import com.amjadomari.mvpuserprofile.di.ApplicationContext;
import com.amjadomari.mvpuserprofile.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aomari on 29/09/2017.
 * ApplicationComponent
 * http://www.amjadomari.com
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(UserProfileApplication app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}