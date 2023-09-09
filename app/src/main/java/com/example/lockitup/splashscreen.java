package com.example.lockitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import java.net.Inet4Address;


public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences(save_lock_screen.PREFS_NAME,0);
                boolean hasLoggedIn = sharedPreferences.getBoolean("hasLoggedIn",false);
                if(hasLoggedIn){
                    Intent iHome = new Intent(splashscreen.this,unlock_app.class);
                    startActivity(iHome);
                    finish();
                }else{
                    Intent iLock = new Intent(splashscreen.this,lock_screen.class);
                    startActivity(iLock);
                    finish();
                }



            }
        },1000);

    }
}