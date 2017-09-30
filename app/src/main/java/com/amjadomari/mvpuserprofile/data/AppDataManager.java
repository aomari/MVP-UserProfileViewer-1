package com.amjadomari.mvpuserprofile.data;

import android.content.Context;

import com.amjadomari.mvpuserprofile.data.prefs.UserProfilePreferencesHelper;
import com.amjadomari.mvpuserprofile.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by aomari on 29/09/2017.
 * AppDataManager
 * http://www.amjadomari.com
 */
@Singleton
public class AppDataManager implements DataManager {
    private final Context mContext;
    private final UserProfilePreferencesHelper mPreferencesHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          UserProfilePreferencesHelper preferencesHelper) {
        mContext = context;
        mPreferencesHelper = preferencesHelper;
    }

    @Override
    public void setUserAsLoggedOut() {
        updateUserInfo(
                null,
                null,
                DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT,
                null,
                null,
                null,
                null,
                null,
                null);
    }

    @Override
    public void updateUserInfo(String accessToken, Long userId,
                               LoggedInMode loggedInMode, String userName,
                               String email, String dateOfBirth, String phoneNumber,
                               String website, String profilePicPath) {
        setAccessToken(accessToken);
        setCurrentUserId(userId);
        setCurrentUserLoggedInMode(loggedInMode);
        setCurrentUserName(userName);
        setCurrentUserEmail(email);
        setCurrentUserDateOfBirth(dateOfBirth);
        setCurrentUserPhoneNumber(phoneNumber);
        setCurrentUserWebsite(website);
        setCurrentUserProfilePicUrl(profilePicPath);
    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return mPreferencesHelper.getCurrentUserLoggedInMode();
    }

    @Override
    public void setCurrentUserLoggedInMode(LoggedInMode mode) {
        mPreferencesHelper.setCurrentUserLoggedInMode(mode);
    }

    @Override
    public Long getCurrentUserId() {
        return mPreferencesHelper.getCurrentUserId();
    }

    @Override
    public void setCurrentUserId(Long userId) {
        mPreferencesHelper.setCurrentUserId(userId);
    }

    @Override
    public String getCurrentUserName() {
        return mPreferencesHelper.getCurrentUserName();
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPreferencesHelper.setCurrentUserName(userName);
    }

    @Override
    public String getCurrentUserEmail() {
        return mPreferencesHelper.getCurrentUserEmail();
    }

    @Override
    public void setCurrentUserEmail(String email) {
        mPreferencesHelper.setCurrentUserEmail(email);
    }

    @Override
    public String getCurrentUserWebsite() {
        return mPreferencesHelper.getCurrentUserWebsite();
    }

    @Override
    public void setCurrentUserWebsite(String website) {
        mPreferencesHelper.setCurrentUserWebsite(website);
    }

    @Override
    public String getCurrentUserDateOfBirth() {
        return mPreferencesHelper.getCurrentUserDateOfBirth();
    }

    @Override
    public void setCurrentUserDateOfBirth(String dateOfBirth) {
        mPreferencesHelper.setCurrentUserDateOfBirth(dateOfBirth);
    }

    @Override
    public String getCurrentUserPhoneNumber() {
        return mPreferencesHelper.getCurrentUserPhoneNumber();
    }

    @Override
    public void setCurrentUserPhoneNumber(String phoneNumber) {
        mPreferencesHelper.setCurrentUserPhoneNumber(phoneNumber);
    }

    @Override
    public String getCurrentUserProfilePicUrl() {
        return mPreferencesHelper.getCurrentUserProfilePicUrl();
    }

    @Override
    public void setCurrentUserProfilePicUrl(String profilePicUrl) {
        mPreferencesHelper.setCurrentUserProfilePicUrl(profilePicUrl);
    }

    @Override
    public String getAccessToken() {
        return mPreferencesHelper.getAccessToken();
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPreferencesHelper.setAccessToken(accessToken);
    }
}
