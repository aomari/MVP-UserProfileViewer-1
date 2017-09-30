package com.amjadomari.mvpuserprofile.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.amjadomari.mvpuserprofile.R;
import com.amjadomari.mvpuserprofile.ui.base.BaseActivity;
import com.amjadomari.mvpuserprofile.ui.login.LoginActivity;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by aomari on 29/09/2017.
 * MainActivity
 * http://www.amjadomari.com
 */
public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    MainMvpPresenter<MainMvpView> mPresenter;

    @BindView(R.id.profile_image)
    CircularImageView imageProfile;

    @BindView(R.id.tv_username)
    TextView tvUserName;

    @BindView(R.id.tv_email)
    TextView tvEmail;

    @BindView(R.id.tv_website)
    TextView tvWebsite;

    @BindView(R.id.tv_dob)
    TextView tvDateOfBirth;

    @BindView(R.id.tv_phone)
    TextView tvPhoneNumber;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(MainActivity.this);

        setUp();
    }

    @Override
    public boolean isNetworkConnected() {
        return true;
    }

    @Override
    protected void setUp() {
        mPresenter.loadProfileData();
    }

    @Override
    public void openLoginActivity() {
        startActivity(LoginActivity.getStartIntent(this));
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @OnClick(R.id.btn_logout)
    public void onLogoutClicked() {
        mPresenter.onLogoutClicked();
    }

    @Override
    public void loadProfileImage(String imageUrl) {
        Picasso
                .with(this)
                .load(imageUrl)
                .placeholder(R.mipmap.ic_launcher)
                .into(imageProfile);
    }

    @Override
    public void setCurrentUserEmail(String email) {
        tvEmail.setText(email);
    }

    @Override
    public void setCurrentUserName(String userName) {
        tvUserName.setText(userName);
    }

    @Override
    public void setCurrentUserWebsite(String website) {
        tvWebsite.setText(website);
    }

    @Override
    public void setCurrentUserDateOfBirth(String dateOfBirth) {
        tvDateOfBirth.setText(dateOfBirth);
    }

    @Override
    public void setCurrentUserPhone(String phoneNumber) {
        tvPhoneNumber.setText(phoneNumber);
    }
}
