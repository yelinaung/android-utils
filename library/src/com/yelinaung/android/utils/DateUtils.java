package com.yelinaung.android.utils;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateUtils {

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
        Log.e("df",df.format(cal.getTime()));
        return df.format(cal.getTime());
    }

    public static String StringToDate(String mFormat , String thenDate) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat(mFormat);
        Date date = formatter.parse(thenDate);


    Log.e("Date",formatter.format(date).toString());
    return formatter.format(date).toString();
    }

}