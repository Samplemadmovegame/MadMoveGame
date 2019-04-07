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
        private Button skipButton;

    public IntroFragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_intro_fragment4, container, false);

        skipButton = view.findViewById(R.id.skip_button);

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To Open LoginView
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });

        return view;
    }

}
