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
import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Ye Lin Aung on 14/01/15.
 */
public class JSONUtils {

    Context mContext;
    Activity mActivity;

    public JSONUtils(Context mContext) {
        this.mContext = mContext;
    }

    public JSONUtils(Activity mActivity) {
        this.mActivity = mActivity;
    }

    public String toS(JSONObject mJsonObject, String mString) throws JSONException {
        if (mJsonObject.has(mString)) {
            return mJsonObject.getString(mString);
        }
        return "";
    }

    public String toS(JSONArray mJsonArray, int position, String mString) throws JSONException {
        if (mJsonArray.getJSONObject(position).has(mString)) {
            return mJsonArray.getJSONObject(position).getString(mString);
        }
        return "";
    }

    public int toI(JSONObject mJsonObject, String mString) throws JSONException {
        if (mJsonObject.has(mString)) {
            return mJsonObject.getInt(mString);
        }
        return 0;
    }

    public int toI(JSONArray mJsonArray, int position, String mString) throws JSONException {
        if (mJsonArray.getJSONObject(position).has(mString)) {
            return mJsonArray.getJSONObject(position).getInt(mString);
        }
        return 0;
    }

    public Long toL(JSONObject mJsonObject, String mString) throws JSONException {
        if (mJsonObject.has(mString)) {
            return mJsonObject.getLong(mString);
        }
        return 0L;
    }

    public Long toL(JSONArray mJsonArray, int position, String mString) throws JSONException {
        if (mJsonArray.getJSONObject(position).has(mString)) {
            return mJsonArray.getJSONObject(position).getLong(mString);
        }
        return 0L;
    }

}
