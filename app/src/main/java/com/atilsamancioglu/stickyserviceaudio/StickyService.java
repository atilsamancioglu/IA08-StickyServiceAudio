package com.atilsamancioglu.stickyserviceaudio;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.util.Log;

public class StickyService extends Service {

    MediaPlayer mediaPlayer;
    private static final String TAG = "StickyService";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d(TAG, "onStartCommand: ");

        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();


        return START_STICKY;
    }

    @Override
    public void onDestroy() {

        Log.d(TAG, "onDestroy: ");

        mediaPlayer.stop();
        super.onDestroy();
    }
}
