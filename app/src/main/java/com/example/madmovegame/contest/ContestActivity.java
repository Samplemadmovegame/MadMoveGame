package com.example.madmovegame.contest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.madmovegame.R;
import com.example.madmovegame.contest.adapter.ContestListAdapter;
import com.example.madmovegame.contest.model.Contest;
import com.example.madmovegame.home.model.AllSports;

public class ContestActivity extends AppCompatActivity implements ContestFrag.OnContestFragmentInteractionListener {
    public static final String PARAM = "param";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest);

        Bundle extras = getIntent().getExtras();
        AllSports sports = extras.getParcelable(PARAM);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_menu_camera));
       // getSupportFragmentManager().beginTransaction().add(R.id.container, ContestFrag.newInstance()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container, ContestInfo.newInstance(new Contest("Mega Contest","Get Ready For Mega Winner","21,60,000","14,98,000","8 Crores","49"))).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.constests, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.wallet) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void openContestInfo(Contest contest) {
        getSupportFragmentManager().beginTransaction().add(R.id.container,ContestInfo.newInstance(contest));

    }
}
