package com.sample.mydagger;

import com.sample.mydagger.modules.utils.NetworkUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
 
    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
 
}