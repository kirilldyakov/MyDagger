package com.sample.mydagger.modules;

import com.sample.mydagger.modules.utils.NetworkUtils;


import org.apache.http.client.HttpClient;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
 
    @Provides
    NetworkUtils provideNetworkUtils(HttpClient httpClient) {
        return new NetworkUtils(httpClient);
    }
 
    @Provides HttpClient provideHttpClient() {
        return new HttpClient();
    }
 
}