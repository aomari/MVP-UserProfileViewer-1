package com.amjadomari.mvpuserprofile.ui.main;

import com.amjadomari.mvpuserprofile.ui.base.MvpView;

/**
 * Created by aomari on 29/09/2017.
 * MainMvpView
 * http://www.amjadomari.com
 */

public interface MainMvpView extends MvpView {
    void openLoginActivity();
    void loadProfileImage(String imageUrl);
    void setCurrentUserEmail(String email);
    void setCurrentUserName(String userName);
    void setCurrentUserWebsite(String website);
    void setCurrentUserDateOfBirth(String dateOfBirth);
    void setCurrentUserPhone(String phoneNumber);
}
