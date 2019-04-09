package com.example.madmovegame.team;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.madmovegame.R;

public class TeamActivity extends AppCompatActivity implements TeamFrag.OnTeamFragmentInteractionListener, TeamPreview.OnTeamPreviewFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportFragmentManager().beginTransaction().add(R.id.container, TeamFrag.newInstance()).commit();
    }

    @Override
    public void onclickTeamPreview() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, TeamPreview.newInstance()).commit();

    }

    @Override
    public void onClickContinue() {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
