package com.cnti.canaima.tribus_app_android;

import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;


import android.os.Bundle;


public class TribusAppAndroid extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        super.loadUrl(Config.getStartUrl());
    }

}
