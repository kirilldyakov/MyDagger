package com.sample.mydagger.components;

import com.sample.mydagger.MainActivity;
import com.sample.mydagger.NetworkModule;
import com.sample.mydagger.modules.data.DatabaseHelper;
import com.sample.mydagger.modules.data.StorageModule;
import com.sample.mydagger.modules.utils.NetworkUtils;

import dagger.Component;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    void injectsMainActivity(MainActivity mainActivity);
}