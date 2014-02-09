
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

/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yelinaung.android.utils;

import android.util.Log;

/**
 * Created by Ye Lin Aung on 14/01/18.
 */

public class LogUtils {

    // Define your prefix here
    private static String LOG_PREFIX;
    private static final int LOG_PREFIX_LENGTH = LOG_PREFIX.length();
    private static final int MAX_LOG_TAG_LENGTH = 23;

    public LogUtils() {
    }

    // TODO You have to specify your own prefix
    public static String setPrefix(String prefix) {
        return LOG_PREFIX = prefix;
    }

    public static String makeLogTag(String str) {
        if (str.length() > MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            return LOG_PREFIX
                    + str.substring(0, MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH
                    - 1);
        }
        return LOG_PREFIX + str;
    }

    public static String makeLogTag(Class<?> cls) {
        return makeLogTag(cls.getSimpleName());
    }

    public static void LOGD(final String tag, String message) {
        Throwable throwable = new Throwable();
        StackTraceElement[] e = throwable.getStackTrace();
        String c_name = e[1].getMethodName();

        if (BuildConfig.DEBUG) {
            Log.d(tag, "[" + c_name + "] " + message);
        } else if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, "[" + c_name + "] " + message);
        } else {
            Log.d(tag, "[" + c_name + "] " + message);
        }
    }

    public static void LOGD(final String tag, String message,
                            Throwable throwable) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message, throwable);
        } else if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, message, throwable);
        } else {
            Log.d(tag, message, throwable);
        }
    }

    public static void LOGV(final String tag, String message) {
        Throwable throwable = new Throwable();
        StackTraceElement[] e = throwable.getStackTrace();
        String c_name = e[1].getMethodName();

        if (BuildConfig.DEBUG) {
            Log.v(tag, "[" + c_name + "] " + message);
        } else if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.v(tag, "[" + c_name + "] " + message);
        } else {
            Log.v(tag, "[" + c_name + "] " + message);
        }
    }

    public static void LOGV(final String tag, String message,
                            Throwable throwable) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, message, throwable);
        } else if (Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, message, throwable);
        }
    }

    public static void LOGI(final String tag, String message) {
        Throwable throwable = new Throwable();
        StackTraceElement[] e = throwable.getStackTrace();
        String c_name = e[1].getMethodName();

        if (BuildConfig.DEBUG) {
            Log.i(tag, "[" + c_name + "] " + message);
        } else if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.i(tag, "[" + c_name + "] " + message);
        } else {
            Log.i(tag, "[" + c_name + "] " + message);
        }
    }

    public static void LOGI(final String tag, String message,
                            Throwable throwable) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, message, throwable);
        } else if (Log.isLoggable(tag, Log.VERBOSE)) {
            Log.i(tag, message, throwable);
        } else {
            Log.i(tag, message, throwable);
        }
    }

    public static void LOGE(final String tag, String message) {
        Throwable throwable = new Throwable();
        StackTraceElement[] e = throwable.getStackTrace();
        String c_name = e[1].getMethodName();

        if (BuildConfig.DEBUG) {
            Log.e(tag, "[" + c_name + "] " + message);
        } else if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.e(tag, "[" + c_name + "] " + message);
        } else {
            Log.e(tag, "[" + c_name + "] " + message);
        }
    }

    public static void LOGE(final String tag, String message,
                            Throwable throwable) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, message, throwable);
        } else if (Log.isLoggable(tag, Log.VERBOSE)) {
            Log.e(tag, message, throwable);
        } else {
            Log.e(tag, message, throwable);
        }
    }
}
