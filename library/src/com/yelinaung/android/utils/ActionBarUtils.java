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
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by Ye Lin Aung on 14/02/15.
 */
public class ActionBarUtils {

    // Empty Constructor
    public ActionBarUtils() {
    }

    public void setActionBarTF(Activity mActivity, Typeface tf) {
        int titleId = mActivity.getResources().getIdentifier("action_bar_title", "id",
                "android");
        TextView abTitle = (TextView)
                mActivity.getWindow().findViewById(titleId);
        abTitle.setTypeface(tf);
    }
}
