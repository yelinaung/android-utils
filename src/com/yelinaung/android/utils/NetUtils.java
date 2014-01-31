/*
 * Copyright (c) 2014. Ye Lin Aung
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.yelinaung.android.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import static com.yelinaung.android.utils.LogUtils.LOGE;
import static com.yelinaung.android.utils.LogUtils.makeLogTag;

/**
 * Created by Ye Lin Aung on 14/01/20.
 */
public class NetUtils {

    static String TAG = makeLogTag(NetUtils.class);

    // Check the device is connected to the internet
    public static boolean isOnlineOrNot(Context mContext) {
        NetworkInfo netInfo = null;
        try {
            ConnectivityManager cm = (ConnectivityManager) mContext
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            netInfo = cm.getActiveNetworkInfo();
        } catch (SecurityException e) {
            e.printStackTrace();
            LOGE(TAG, mContext.getString(R.string.missing_internet));
        }
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
