package com.amjadomari.mvpuserprofile.ui.login;

import com.amjadomari.mvpuserprofile.di.PerActivity;
import com.amjadomari.mvpuserprofile.ui.base.MvpPresenter;

/**
 * Created by aomari on 29/09/2017.
 * LoginMvpPresenter
 * http://www.amjadomari.com
 */
@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {
    void onServerLoginClick(String email, String password);

    void onGoogleLoginClick();

    void onFacebookLoginClick();
}
