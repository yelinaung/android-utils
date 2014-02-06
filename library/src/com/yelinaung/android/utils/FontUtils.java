package com.yelinaung.android.utils;

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
}
