package com.amjadomari.mvpuserprofile.ui.splash;

import com.amjadomari.mvpuserprofile.ui.base.MvpView;

/**
 * Created by aomari on 29/09/2017.
 * SplashMvpView
 * http://www.amjadomari.com
 */

public interface SplashMvpView extends MvpView {
    void openLoginActivity();

    void openMainActivity();

    void startSyncService();
}
