package com.android.voicecommand;

import android.app.Application;

import net.gotev.speech.Speech;

import java.util.logging.Logger;

/**
 * Created by Aprilian Nur on 12/8/2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Speech.init(this, getPackageName());
        //Logger.setLogLevel(Logger.LogLevel.DEBUG);
    }
}