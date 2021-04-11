package com.example.boundservice;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Random;

public class MyService extends Service {
    private final IBinder iBinder=new LocalBinder();
    private final Random mGenerator=new Random();

    public class LocalBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }
    public MyService(){

    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    public int getRandom(){
        return mGenerator.nextInt(200);

    }

}
