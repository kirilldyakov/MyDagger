package com.sample.mydagger.modules.data;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {
 
    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }
 
}