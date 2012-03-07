package com.jumpbyte.phonegap.test;

import com.phonegap.DroidGap;

import android.app.Activity;
import android.os.Bundle;

public class TestAppActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        super.loadUrl("file:///android_asset/www/index.html");
    }
}