package com.example.nuevoreproductormultimedia;

import android.preference.PreferenceActivity;

import java.util.List;

public class MisFragmentsPreferencias extends PreferenceActivity {

    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);

        loadHeadersFromResource(R.xml.preference_header,target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {

        if(PreferenciasUsuario.class.getName().equals(fragmentName))
            return true;

        return false;
    }
}
