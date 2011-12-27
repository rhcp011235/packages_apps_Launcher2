package com.android.launcher2;

import android.content.Context;
import android.content.SharedPreferences;

public final class PreferencesProvider {
    public static final String PREFERENCES_KEY = "com.android.launcher_preferences";
    public static final String PREFERENCES_CHANGED = "preferences_changed";

    public static boolean getAutoRotate(Context context) {
        final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
        return preferences.getBoolean("auto_rotate", true);
    }
    public static boolean getShowSearchBar(Context context) {
        final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
        return preferences.getBoolean("show_search_bar", true);
    }
}
    
