package com.yelinaung.android.utils.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Ye Lin Aung on 13/11/15.
 */
public class RobotoRegularTV extends TextView {
    public RobotoRegularTV(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        createFont();
    }

    public RobotoRegularTV(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public RobotoRegularTV(Context context) {
        super(context);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Regular.ttf");
        setTypeface(font);
    }

}
