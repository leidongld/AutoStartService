package com.example.leidong.autostartservice;

import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("autostart", ContextWrapper.MODE_PRIVATE);

        //打开
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("AutoStartService", true);
                editor.commit();

                Intent intent = new Intent(MainActivity.this, AutoStartService.class);
                startService(intent);
            }
        });

        //关闭
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("AutoStartService", false);
                editor.commit();
                Toast.makeText(MainActivity.this, "开机自启动关闭啦！！！", Toast.LENGTH_LONG).show();
            }
        });
    }
}
