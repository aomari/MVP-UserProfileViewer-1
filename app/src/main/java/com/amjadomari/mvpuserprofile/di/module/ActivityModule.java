package com.amjadomari.mvpuserprofile.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.amjadomari.mvpuserprofile.di.ActivityContext;
import com.amjadomari.mvpuserprofile.di.PerActivity;
import com.amjadomari.mvpuserprofile.ui.login.LoginMvpPresenter;
import com.amjadomari.mvpuserprofile.ui.login.LoginMvpView;
import com.amjadomari.mvpuserprofile.ui.login.LoginPresenter;
import com.amjadomari.mvpuserprofile.ui.main.MainMvpPresenter;
import com.amjadomari.mvpuserprofile.ui.main.MainMvpView;
import com.amjadomari.mvpuserprofile.ui.main.MainPresenter;
import com.amjadomari.mvpuserprofile.ui.splash.SplashMvpPresenter;
import com.amjadomari.mvpuserprofile.ui.splash.SplashMvpView;
import com.amjadomari.mvpuserprofile.ui.splash.SplashPresenter;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by aomari on 29/09/2017.
 * ActivityModule
 * http://www.amjadomari.com
 */
@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
