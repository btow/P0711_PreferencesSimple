package com.example.samsung.p0711_preferencessimple;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

/**
 * Created by samsung on 04.04.2017.
 */

public class PrefActivity extends PreferenceActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref);
    }
}
