package com.example.nuevoreproductormultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class Reproductor extends AppCompatActivity {

    ImageButton play,stop,pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        play=(ImageButton)findViewById(R.id.play);
        stop=(ImageButton)findViewById(R.id.stop);
        pause=(ImageButton)findViewById(R.id.pause);



    }
}
