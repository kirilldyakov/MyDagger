package com.sample.mydagger;

import android.app.Application;

import com.sample.mydagger.components.AppComponent;
import com.sample.mydagger.components.DaggerAppComponent;

public class App extends Application {
 
    private static AppComponent component;
 
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }
 
    public static AppComponent getComponent() {
        return component;
    }
 
}