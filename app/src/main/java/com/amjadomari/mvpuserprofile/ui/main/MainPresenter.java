package com.amjadomari.mvpuserprofile.ui.main;

import com.amjadomari.mvpuserprofile.data.DataManager;
import com.amjadomari.mvpuserprofile.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by aomari on 29/09/2017.
 * MainPresenter
 * http://www.amjadomari.com
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V>
        implements MainMvpPresenter<V> {

    @Inject
    public MainPresenter(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }

    @Override
    public void onLogoutClicked() {
        getDataManager().setUserAsLoggedOut();
        getMvpView().openLoginActivity();
    }

    @Override
    public void loadProfileData() {
        getMvpView().setCurrentUserName(getDataManager().getCurrentUserName());
        getMvpView().setCurrentUserEmail(getDataManager().getCurrentUserEmail());
        getMvpView().setCurrentUserWebsite(getDataManager().getCurrentUserWebsite());
        getMvpView().loadProfileImage(getDataManager().getCurrentUserProfilePicUrl());
        getMvpView().setCurrentUserDateOfBirth(getDataManager().getCurrentUserDateOfBirth());
        getMvpView().setCurrentUserPhone(getDataManager().getCurrentUserPhoneNumber());

    }
}
