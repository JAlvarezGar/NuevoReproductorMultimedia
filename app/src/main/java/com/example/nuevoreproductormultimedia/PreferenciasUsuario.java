package com.example.nuevoreproductormultimedia;

import android.os.Bundle;
import android.preference.PreferenceFragment;


public class PreferenciasUsuario extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferencias);
    }
}
