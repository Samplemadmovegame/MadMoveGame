package com.example.madmovegame.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.madmovegame.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //For Splash Screen Time Out
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //For New User
                startActivity(new Intent(SplashActivity.this,IntroductionActivity.class));

                //For Existing User
               // startActivity(new Intent(SplashActivity.this,LoginActivity.class));

            }
        },2000);


    }
}
