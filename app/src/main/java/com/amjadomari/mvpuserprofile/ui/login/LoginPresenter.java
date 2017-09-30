package com.amjadomari.mvpuserprofile.ui.login;

import android.os.Handler;

import com.amjadomari.mvpuserprofile.R;
import com.amjadomari.mvpuserprofile.data.DataManager;
import com.amjadomari.mvpuserprofile.ui.base.BasePresenter;
import com.amjadomari.mvpuserprofile.utils.CommonUtils;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by aomari on 29/09/2017.
 * LoginPresenter
 * http://www.amjadomari.com
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V>
        implements LoginMvpPresenter<V> {

    @Inject
    public LoginPresenter(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }

    @Override
    public void onServerLoginClick(String email, String password) {
        //validate email and password
        if (email == null || email.isEmpty()) {
            getMvpView().onError(R.string.empty_email);
            return;
        }
        if (!CommonUtils.isEmailValid(email)) {
            getMvpView().onError(R.string.invalid_email);
            return;
        }
        if (password == null || password.isEmpty()) {
            getMvpView().onError(R.string.empty_password);
            return;
        }

        // instruct LoginActivity to initiate facebook login
        getMvpView().showLoading();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getDataManager().updateUserInfo(
                        "i5uc8mwjc3mpri3pcmdjkwpeope3pe03m4",
                        879425L,
                        DataManager.LoggedInMode.LOGGED_IN_MODE_SERVER,
                        "aomari",
                        "aomari@asaltech.com",
                        "29-5-1989",
                        "+972 59-1234 879",
                        "http://www.amjadomari.com",
                        "https://previews.123rf.com/images/rido/rido1305/rido130500031/19500129-Closeup-Of-Happy-Young-Man-Isolated-Over-White-Background-Stock-Photo.jpg"
                );
                getMvpView().hideLoading();
                getMvpView().openMainActivity();
            }
        }, 2000);
    }

    @Override
    public void onGoogleLoginClick() {
        // instruct LoginActivity to initiate facebook login
        getMvpView().showLoading();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getDataManager().updateUserInfo(
                        "i5uc8mwjc3mpri3pcmdjkwpeope3pe03m4",
                        879425L,
                        DataManager.LoggedInMode.LOGGED_IN_MODE_GOOGLE,
                        "aomari",
                        "aomari@asaltech.com",
                        "29-5-1989",
                        "+972 59-1234 879",
                        "http://www.amjadomari.com",
                        "https://previews.123rf.com/images/rido/rido1305/rido130500031/19500129-Closeup-Of-Happy-Young-Man-Isolated-Over-White-Background-Stock-Photo.jpg"
                );
                getMvpView().hideLoading();
                getMvpView().openMainActivity();
            }
        }, 2000);
    }

    @Override
    public void onFacebookLoginClick() {
        // instruct LoginActivity to initiate facebook login
        getMvpView().showLoading();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getDataManager().updateUserInfo(
                        "i5uc8mwjc3mpri3pcmdjkwpeope3pe03m4",
                        879425L,
                        DataManager.LoggedInMode.LOGGED_IN_MODE_FB,
                        "aomari",
                        "aomari@asaltech.com",
                        "29-5-1989",
                        "+972 59-1234 879",
                        "http://www.amjadomari.com",
                        "https://previews.123rf.com/images/rido/rido1305/rido130500031/19500129-Closeup-Of-Happy-Young-Man-Isolated-Over-White-Background-Stock-Photo.jpg"
                );
                getMvpView().hideLoading();
                getMvpView().openMainActivity();
            }
        }, 2000);
    }
}
