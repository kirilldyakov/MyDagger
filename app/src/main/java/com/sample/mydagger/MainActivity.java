package com.sample.mydagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sample.mydagger.modules.data.DatabaseHelper;
import com.sample.mydagger.modules.utils.NetworkUtils;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DatabaseHelper databaseHelper;

    @Inject
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().injectsMainActivity(this);
    }
}
