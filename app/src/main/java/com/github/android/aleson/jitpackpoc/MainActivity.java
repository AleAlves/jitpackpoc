package com.github.android.aleson.jitpackpoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.android.aleson.anylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Test();
    }
}
