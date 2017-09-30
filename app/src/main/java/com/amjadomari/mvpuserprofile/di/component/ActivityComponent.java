package com.amjadomari.mvpuserprofile.di.component;

import com.amjadomari.mvpuserprofile.di.PerActivity;
import com.amjadomari.mvpuserprofile.di.module.ActivityModule;
import com.amjadomari.mvpuserprofile.ui.login.LoginActivity;
import com.amjadomari.mvpuserprofile.ui.main.MainActivity;
import com.amjadomari.mvpuserprofile.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by aomari on 29/09/2017.
 * ActivityComponent
 * http://www.amjadomari.com
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);
}
