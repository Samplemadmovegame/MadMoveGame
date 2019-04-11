package com.example.madmovegame.team;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.madmovegame.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TeamPreview.OnTeamPreviewFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TeamPreview#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TeamPreview extends Fragment {

    private OnTeamPreviewFragmentInteractionListener mListener;
    private Button continue_bt;
    private ImageView closeBt;

    public TeamPreview() {
        // Required empty public constructor
    }

    public static TeamPreview newInstance() {

        Bundle args = new Bundle();

        TeamPreview fragment = new TeamPreview();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_team_preview, container, false);
        continue_bt=view.findViewById(R.id.continue_bt);
        closeBt=view.findViewById(R.id.close_bt);
        continue_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickContinue();
            }
        });
        closeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        return  view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnTeamPreviewFragmentInteractionListener) {
            mListener = (OnTeamPreviewFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnTeamPreviewFragmentInteractionListener {
        void onClickContinue();
    }
}
