package com.amjadomari.mvpuserprofile.ui.base;

/**
 * Created by aomari on 29/09/2017.
 * MvpPresenter
 * http://www.amjadomari.com
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void setUserAsLoggedOut();
}