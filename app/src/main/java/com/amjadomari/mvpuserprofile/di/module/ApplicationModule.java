package com.amjadomari.mvpuserprofile.di.module;

import android.app.Application;
import android.content.Context;

import com.amjadomari.mvpuserprofile.R;
import com.amjadomari.mvpuserprofile.data.AppDataManager;
import com.amjadomari.mvpuserprofile.data.DataManager;
import com.amjadomari.mvpuserprofile.data.prefs.AppUserProfilePreferencesHelper;
import com.amjadomari.mvpuserprofile.data.prefs.UserProfilePreferencesHelper;
import com.amjadomari.mvpuserprofile.di.ApplicationContext;
import com.amjadomari.mvpuserprofile.di.PreferenceInfo;
import com.amjadomari.mvpuserprofile.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by aomari on 29/09/2017.
 * ApplicationModule
 * http://www.amjadomari.com
 */
@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    UserProfilePreferencesHelper providePreferencesHelper(AppUserProfilePreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }
}
