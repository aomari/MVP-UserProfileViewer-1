package com.amjadomari.mvpuserprofile.data;

import com.amjadomari.mvpuserprofile.data.prefs.UserProfilePreferencesHelper;

/**
 * Created by aomari on 29/09/2017.
 * DataManager
 * http://www.amjadomari.com
 */

public interface DataManager extends UserProfilePreferencesHelper {
    void setUserAsLoggedOut();

    void updateUserInfo(
            String accessToken,
            Long userId,
            LoggedInMode loggedInMode,
            String userName,
            String email,
            String dateOfBirth,
            String phoneNumber,
            String website,
            String profilePicPath);

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3);

        private final int mType;

        LoggedInMode(int type) {
            mType = type;
        }

        public int getType() {
            return mType;
        }
    }
}
