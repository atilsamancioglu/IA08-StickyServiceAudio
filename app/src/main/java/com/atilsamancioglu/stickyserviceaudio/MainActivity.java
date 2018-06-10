package com.atilsamancioglu.stickyserviceaudio;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play (View view) {
        Intent intent = new Intent(this,StickyService.class);
        startService(intent);
    }

    public void stop (View view) {
        Intent intent = new Intent(this,StickyService.class);
        stopService(intent);
    }


}
