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
import android.graphics.Typeface;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ye Lin Aung on 14/02/06.
 */
public class FontUtils {

    public static boolean checkMMFont(String s) {
        Pattern p = Pattern.compile("[^\\u0000-\\u0080]+");
        Matcher matcher = p.matcher(s);
        return matcher.find();
    }

    public static void setRobotoLight(Context mContext, TextView tv) {
        Typeface font = Typeface.createFromAsset(mContext.getAssets(),
                "font/Roboto-Light.ttf");
        tv.setTypeface(font);
    }

    public static void setRobotoCondense(Context mContext, TextView tv) {
        Typeface font = Typeface.createFromAsset(mContext.getAssets(),
                "font/RobotoCondensed-Regular.ttf");
        tv.setTypeface(font);
    }

    public static void setRoboto(Context mContext, TextView tv) {
        Typeface font = Typeface.createFromAsset(mContext.getAssets(),
                "font/Roboto-Regular.ttf");
        tv.setTypeface(font);
    }

    public static void setRobotoMedium(Context mContext, TextView tv) {
        Typeface font = Typeface.createFromAsset(mContext.getAssets(),
                "font/Roboto-Medium.ttf");
        tv.setTypeface(font);
    }

    public static void setRobotoCondenseBold(Context mContext, TextView tv) {
        Typeface font = Typeface.createFromAsset(mContext.getAssets(),
                "font/RobotoCondensed-Bold.ttf");
        tv.setTypeface(font);
    }
}
