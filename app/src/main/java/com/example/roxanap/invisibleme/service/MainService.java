package com.example.roxanap.invisibleme.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by roxanap on 21.01.2016.
 */
public class MainService extends Service {

    private static final String TAG = MainService.class.getName();

    private IBinder binder = new ServiceBinder();
    int startMode;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Bundle extras = intent.getExtras();
        if(extras!=null){
            Log.d(TAG, "onBind with extras");
        }
        return binder;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }


    public class ServiceBinder extends Binder {
        public MainService getService(){
            return MainService.this;
        }
    }
}
