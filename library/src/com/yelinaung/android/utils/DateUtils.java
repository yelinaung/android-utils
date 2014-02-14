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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static com.yelinaung.android.utils.LogUtils.LOGE;
import static com.yelinaung.android.utils.LogUtils.makeLogTag;

public class DateUtils {

    private static String TAG = makeLogTag(DateUtils.class);

    public static String getDateDifference(Date thenDate) throws ParseException {
        long diff;

        Calendar now = Calendar.getInstance();
        Calendar then = Calendar.getInstance();

        now.setTime(new Date());
        then.setTime(thenDate);

        // Get the represented date in milliseconds
        long nowMs = now.getTimeInMillis();
        long thenMs = then.getTimeInMillis();

        // Calculate difference in milliseconds
        diff = nowMs - thenMs;

        // Calculate difference in seconds
        long diffMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);
        long diffDays = diff / (24 * 60 * 60 * 1000);

        if (diffMinutes < 60) {
            if (diffMinutes == 1) {
                return diffMinutes + " M";
            } else {
                return diffMinutes + " M";
            }
        } else if (diffHours < 24) {
            if (diffHours == 1)
                return diffHours + " hr";
            else
                return diffHours + " hr";
        } else if (diffDays < 30) {
            if (diffDays == 1) {
                return diffDays + " D";
            } else if (diffDays < 10) {
                return diffDays + " D";
            } else {

                return thenDate.toString();
            }
        } else {
            return thenDate.toString();

        }
    }

    public static String DateToString(String mFormat, Date thenDate) {
        Calendar cal = Calendar.getInstance();

        cal.setTime(thenDate);
        //example MFormat = EEEE:MM:yyyy
        SimpleDateFormat df = new SimpleDateFormat(mFormat, Locale.ENGLISH);
        return df.format(cal.getTime());
    }

    public static String StringToDate(String mFormat, String thenDate) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat(mFormat);
        Date date = formatter.parse(thenDate);
        return formatter.format(date);
    }

}