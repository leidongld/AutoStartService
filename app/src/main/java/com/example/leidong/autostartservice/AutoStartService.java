package com.example.leidong.autostartservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by leidong on 2017/4/28.
 */

public class AutoStartService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Toast.makeText(getApplicationContext(), "开机启动功能实现啦！！！", Toast.LENGTH_LONG).show();
    }
}
