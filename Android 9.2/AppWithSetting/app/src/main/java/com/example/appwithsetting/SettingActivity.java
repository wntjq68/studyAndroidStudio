package com.example.appwithsetting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SettingActivity extends AppCompatActivity {

    public static final String KEY_PREF_EXAMPLE_SWITCH = "example_switch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}