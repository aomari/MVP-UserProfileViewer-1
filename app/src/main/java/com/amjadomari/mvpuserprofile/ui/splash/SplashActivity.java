package com.amjadomari.mvpuserprofile.ui.splash;

import android.content.Intent;
import android.os.Bundle;

import com.amjadomari.mvpuserprofile.R;
import com.amjadomari.mvpuserprofile.ui.base.BaseActivity;
import com.amjadomari.mvpuserprofile.ui.login.LoginActivity;
import com.amjadomari.mvpuserprofile.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by aomari on 29/09/2017.
 * SplashActivity
 * http://www.amjadomari.com
 */
public class SplashActivity extends BaseActivity implements SplashMvpView {

    @Inject
    SplashMvpPresenter<SplashMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(SplashActivity.this);
    }

    /**
     * Making the screen wait so that the  branding can be shown
     */
    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void startSyncService() {
//        SyncService.start(this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }

    @Override
    public boolean isNetworkConnected() {
        return true;
    }
}
