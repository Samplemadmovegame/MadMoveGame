package com.example.madmovegame.fragment.introductionFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.madmovegame.R;
import com.example.madmovegame.activity.LoginActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment4 extends Fragment {

    public IntroFragment4() {
        // Required empty public constructor
    }

    public static IntroFragment4 newInstance() {
        
        Bundle args = new Bundle();
        
        IntroFragment4 fragment = new IntroFragment4();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_intro_fragment4, container, false);

    }

}
