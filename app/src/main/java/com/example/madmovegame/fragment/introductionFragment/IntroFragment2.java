package com.example.madmovegame.fragment.introductionFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.madmovegame.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment2 extends Fragment {

    private Button skipButton;


    public IntroFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_intro_fragment2, container, false);

        skipButton = view.findViewById(R.id.skip_button);

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntroFragment3 introFragment3 = new IntroFragment3();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.container_view,introFragment3).addToBackStack(null).commit();
            }
        });

        return view;
    }

}
