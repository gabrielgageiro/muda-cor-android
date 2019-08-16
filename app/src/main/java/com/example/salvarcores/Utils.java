package com.example.salvarcores;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {
    private static final List<String> colorList = Arrays.asList("red", "blue", "green", "black", "white", "gray", "cyan", "magenta", "yellow",
            "lightgray", "darkgray", "grey", "lightgrey", "darkgrey", "aqua", "fuchsia", "lime", "maroon", "navy", "olive", "purple","silver", "teal"
    );

    public static final String randomColor(){
        Random r = new Random();

        int index = r.nextInt((colorList.size() - 0) - 1) + 0;
        return colorList.get(index).toLowerCase();
    }

    public static final void putString(final Context context, final String key, final String value) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();

    }

    public static final String getString(final Context context, final String key) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(key, "");
    }

    public static final void putBoolean(final Context context, final String key, final boolean value) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.commit();

    }

    public static final boolean getBoolean(final Context context, final String key) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, false);
    }

    public static final void putInt(final Context context, final String key, final int value) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.commit();

    }

    public static final int getInt(final Context context, final String key) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(key, 0);
    }

    public static final void putLong(final Context context, final String key, final long value) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key, value);
        editor.commit();

    }

    public static final long getLong(final Context context, final String key) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(key, 0);
    }

}
