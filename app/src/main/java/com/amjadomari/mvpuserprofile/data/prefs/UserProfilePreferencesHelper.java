package com.amjadomari.mvpuserprofile.data.prefs;

import com.amjadomari.mvpuserprofile.data.DataManager;

/**
 * Created by aomari on 29/09/2017.
 * UserProfilePreferencesHelper
 * http://www.amjadomari.com
 */

public interface UserProfilePreferencesHelper {
    int getCurrentUserLoggedInMode();

    void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode);

    Long getCurrentUserId();

    void setCurrentUserId(Long userId);

    String getCurrentUserName();

    void setCurrentUserName(String userName);

    String getCurrentUserEmail();

    void setCurrentUserEmail(String email);

    String getCurrentUserWebsite();

    void setCurrentUserWebsite(String website);

    String getCurrentUserDateOfBirth();

    void setCurrentUserDateOfBirth(String dateOfBirth);

    String getCurrentUserPhoneNumber();

    void setCurrentUserPhoneNumber(String phoneNumber);

    String getCurrentUserProfilePicUrl();

    void setCurrentUserProfilePicUrl(String profilePicUrl);

    String getAccessToken();

    void setAccessToken(String accessToken);
}
