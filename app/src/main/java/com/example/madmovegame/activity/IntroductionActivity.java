package com.example.madmovegame.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.madmovegame.R;
import com.example.madmovegame.adapter.IntroViewPagerAdapter;
import com.example.madmovegame.fragment.introductionFragment.IntroFragment1;
import com.example.madmovegame.fragment.introductionFragment.IntroFragment2;
import com.example.madmovegame.fragment.introductionFragment.IntroFragment3;
import com.example.madmovegame.fragment.introductionFragment.IntroFragment4;

public class IntroductionActivity extends AppCompatActivity {

    private ViewPager introductionViewPager;
    private Button skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        introductionViewPager = findViewById(R.id.introduction_viewpager);
        skipButton = findViewById(R.id.skip_button);

        setUpViewAdapter();

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(IntroductionActivity.this, LoginActivity.class));
            }
        });

    }


    public void setUpViewAdapter(){

        IntroViewPagerAdapter introViewPagerAdapter = new IntroViewPagerAdapter(getSupportFragmentManager());

        introViewPagerAdapter.addFragment(IntroFragment1.newInstance());
        introViewPagerAdapter.addFragment(IntroFragment2.newInstance());
        introViewPagerAdapter.addFragment(IntroFragment3.newInstance());
        introViewPagerAdapter.addFragment(IntroFragment4.newInstance());

        introductionViewPager.setAdapter(introViewPagerAdapter);

    }
}
