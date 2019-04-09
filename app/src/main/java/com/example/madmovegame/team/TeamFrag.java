package com.example.madmovegame.team;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.madmovegame.R;
import com.example.madmovegame.team.adapter.TeamListAdapter;


public class TeamFrag extends Fragment {

    public static final String TAG = "TeamFrag";
    private RecyclerView mTeamRecyclerView;
    private TeamListAdapter mTeamListAdapter;
    private Button teamPreviewBt;

    private OnTeamFragmentInteractionListener mListener;

    public TeamFrag() {
        // Required empty public constructor
    }

    public static TeamFrag newInstance() {

        Bundle args = new Bundle();

        TeamFrag fragment = new TeamFrag();
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
        View view = inflater.inflate(R.layout.fragment_team, container, false);
        mTeamRecyclerView = view.findViewById(R.id.team_recycler_view);
        teamPreviewBt = view.findViewById(R.id.team_preview_bt);
        teamPreviewBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onclickTeamPreview();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpTeamListAdapter();
    }

    private void setUpTeamListAdapter() {
        mTeamListAdapter = new TeamListAdapter(getContext());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mTeamRecyclerView.setLayoutManager(mLayoutManager);
        mTeamRecyclerView.setAdapter(mTeamListAdapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnTeamFragmentInteractionListener) {
            mListener = (OnTeamFragmentInteractionListener) context;
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

    public interface OnTeamFragmentInteractionListener {
        void onclickTeamPreview();
    }
}
