package com.example.nuevoreproductormultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements ImageButton.OnClickListener {

    ImageButton imagB1,imagB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagB1=(ImageButton)findViewById(R.id.Reproductor);
        imagB2= (ImageButton)findViewById(R.id.Preferencias);
        imagB1.setOnClickListener(this);
        imagB2.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.Reproductor){


            Intent intent= new Intent(this,Reproductor.class);
            startActivity(intent);
        }

        if(v.getId()==R.id.Preferencias){

            Intent intent= new Intent(this,MisFragmentsPreferencias.class);
            startActivity(intent);




        }
    }
}
