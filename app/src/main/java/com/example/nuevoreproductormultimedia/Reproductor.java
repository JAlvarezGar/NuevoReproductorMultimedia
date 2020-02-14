package com.example.nuevoreproductormultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class Reproductor extends AppCompatActivity implements ImageButton.OnClickListener {

    ImageButton play, stop, pause;
    MediaPlayer mediaPlayer;
    String nombre;
    boolean gustaRock;
    TextView metadatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        play = (ImageButton) findViewById(R.id.play);
        stop = (ImageButton) findViewById(R.id.stop);
        pause = (ImageButton) findViewById(R.id.pause);

        metadatos=(TextView)findViewById(R.id.metadatos);

        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        pause.setOnClickListener(this);

    }

    @Override
    public void onResume() {
        super.onResume();


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        nombre = preferences.getString("nombre", " ");
        gustaRock = preferences.getBoolean("gustos", false);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.play) {

            if (gustaRock) {
                mediaPlayer = new MediaPlayer().create(this, R.raw.acdc);

                mediaPlayer.start();



            } else {
                mediaPlayer = new MediaPlayer().create(this, R.raw.aire);

                mediaPlayer.start();

            }
            Toast.makeText(this, "sonando ...", Toast.LENGTH_LONG).show();

        }

        if (v.getId() == R.id.pause) {
            if (mediaPlayer.isPlaying())
                mediaPlayer.pause();
        }

        if (v.getId()==R.id.stop){

            if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                try {
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    finish();
                }
            }
        }


    }
}
