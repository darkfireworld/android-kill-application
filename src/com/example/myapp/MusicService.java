package com.example.myapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Administrator on 2016/1/5.
 */
public class MusicService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(MusicService.class.getName(), "onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(MusicService.class.getName(), "onDestroy");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(MusicService.class.getName(), "onStartCommand");
        return START_STICKY;
    }
}
