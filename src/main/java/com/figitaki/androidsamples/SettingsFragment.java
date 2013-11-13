package com.figitaki.androidsamples;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Carey on 11/12/13.
 */
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}
