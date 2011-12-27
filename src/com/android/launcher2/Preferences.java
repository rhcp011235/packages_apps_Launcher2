package com.android.launcher2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.android.launcher.R;

public class Preferences extends PreferenceActivity {

    private static final String TAG = "Launcher.Preferences";

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);

        SharedPreferences prefs =
            getSharedPreferences(PreferencesProvider.PREFERENCES_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean(PreferencesProvider.PREFERENCES_CHANGED, true);
                editor.commit();
    }
}
