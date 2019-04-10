package com.example.madmovegame.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.madmovegame.R;
import com.example.madmovegame.intro.IntroductionActivity;
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

       // For Splash Screen Time Out
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, IntroductionActivity.class));
            }
        },2000);
   }
}
