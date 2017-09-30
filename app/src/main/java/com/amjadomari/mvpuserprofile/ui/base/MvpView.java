package com.amjadomari.mvpuserprofile.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by aomari on 29/09/2017.
 * MvpView
 * http://www.amjadomari.com
 */

public interface MvpView {
    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
