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

import android.app.Activity;

/**
 * Created by Ye Lin Aung on 14/01/15.
 */
public class IntentUtils {

    Activity mActivity;
    public IntentUtils() {
    }

    public IntentUtils(Activity mActivity) {
        this.mActivity = mActivity;
    }

    public boolean hasExtra(String message) {
        return mActivity.getIntent().hasExtra(message);
    }

    public int getIntExtra(String message) {
        if(message != null) {
            return mActivity.getIntent().getExtras().getInt(message);
        }
        return 0;
    }

    public String getStringExtra(String message) {
        if(message!= null ){
            return mActivity.getIntent().getExtras().getString(message);
        }
        return "It's null.";
    }
}
