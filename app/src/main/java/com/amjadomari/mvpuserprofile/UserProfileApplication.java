package com.amjadomari.mvpuserprofile;

import android.app.Application;

import com.amjadomari.mvpuserprofile.data.DataManager;
import com.amjadomari.mvpuserprofile.di.component.ApplicationComponent;
import com.amjadomari.mvpuserprofile.di.component.DaggerApplicationComponent;
import com.amjadomari.mvpuserprofile.di.module.ApplicationModule;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by aomari on 29/09/2017.
 * UserProfileApplication
 * http://www.amjadomari.com
 */

public class UserProfileApplication extends Application {
    @Inject
    DataManager mDataManager;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
}
