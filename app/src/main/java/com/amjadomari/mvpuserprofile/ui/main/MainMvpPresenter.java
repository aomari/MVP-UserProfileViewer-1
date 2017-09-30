package com.amjadomari.mvpuserprofile.ui.main;

import com.amjadomari.mvpuserprofile.di.PerActivity;
import com.amjadomari.mvpuserprofile.ui.base.MvpPresenter;

/**
 * Created by aomari on 29/09/2017.
 * MainMvpPresenter
 * http://www.amjadomari.com
 */
@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {
    void onLogoutClicked();
    void loadProfileData();
}
