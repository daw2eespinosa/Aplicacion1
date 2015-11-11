package com.eduardoespinosa.aplicacion1;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by eduardo on 11/11/15.
 */
public class Preferencies extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencies);
    }
}
