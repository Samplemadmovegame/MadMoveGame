package com.example.madmovegame.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.madmovegame.R;
import com.example.madmovegame.utility.MadMoveUtils;

public class SplashActivity extends AppCompatActivity {
    private ImageView topImageView,bottomImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        topImageView = findViewById(R.id.top_imageView);
        bottomImageView = findViewById(R.id.bottom_imageView);

        MadMoveUtils.setAnimation(this,R.anim.top_to_bottom,topImageView);

        MadMoveUtils.setAnimation(this,R.anim.bottom_to_top,bottomImageView);

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
