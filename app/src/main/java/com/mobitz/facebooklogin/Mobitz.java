package com.mobitz.facebooklogin;

import android.app.Application;

import com.facebook.appevents.AppEventsLogger;

/**
 * Created by
 * Dilipkumar R. Kaklotar
 * [ Senior Android Developer ]
 * Mobile: +91 8000722607
 * Skype: dilipkaklotar
 * Created On 18/04/18.
 */
public class Mobitz extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        AppEventsLogger.activateApp(this);
    }

}
