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
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.madmovegame.Const;
import com.example.madmovegame.R;
import com.example.madmovegame.home.model.AllSports;
import com.example.madmovegame.team.adapter.TeamListAdapter;


public class TeamFrag extends Fragment {

    public static final String TAG = "TeamFrag";
    public static final String PARAM = "param";
    private RecyclerView mTeamRecyclerView;
    private TeamListAdapter mTeamListAdapter;
    private Button teamPreviewBt;
    private ImageView team1Img, team2Img,backBt;
    private TextView team1Name, team2Name;
    private AllSports sport;
    private Context mContext;



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

    public static TeamFrag newInstance(AllSports sports) {
        Bundle args = new Bundle();
        args.putParcelable(PARAM,sports);
        TeamFrag fragment = new TeamFrag();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sport=getArguments().getParcelable(PARAM);
        mContext=getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_team, container, false);
        mTeamRecyclerView = view.findViewById(R.id.team_recycler_view);
        backBt = view.findViewById(R.id.back_bt);
        backBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        teamPreviewBt = view.findViewById(R.id.team_preview_bt);
        teamPreviewBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onclickTeamPreview();
            }
        });

        team1Img = view.findViewById(R.id.team1_img);
        team2Img = view.findViewById(R.id.team2_img);
        team1Name = view.findViewById(R.id.team1_name);
        team2Name = view.findViewById(R.id.team2_name);
        setTeam1Image();
        setTeam2Image();
        team1Name.setText(sport.getTeam1());
        team2Name.setText(sport.getTeam2());
        return view;
    }


    private void setTeam1Image() {

        switch (sport.getTeam1()) {

            case Const.CSK:
                Glide.with(this)
                        .load(mContext.getResources().getDrawable(R.drawable.csk_icon))
                        .into(team1Img);
                break;


            case Const.MI:
                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.mi_icon))
                        .into(team1Img);
                break;


            case Const.KKR:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.kkr_icon))
                        .into(team1Img);
                break;


            case Const.PUNE:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.pune_icon))
                        .into(team1Img);

                break;


            case Const.HYD:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.hyd_icon))
                        .into(team1Img);

                break;


            case Const.RCB:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.rcb_icon))
                        .into(team1Img);

                break;
        }
    }

    private void setTeam2Image() {

        switch (sport.getTeam2()) {

            case Const.CSK:
                Glide.with(this)
                        .load(mContext.getResources().getDrawable(R.drawable.csk_icon))
                        .into(team2Img);
                break;


            case Const.MI:
                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.mi_icon))
                        .into(team2Img);
                break;


            case Const.KKR:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.kkr_icon))
                        .into(team2Img);
                break;


            case Const.PUNE:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.pune_icon))
                        .into(team2Img);

                break;


            case Const.HYD:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.hyd_icon))
                        .into(team2Img);

                break;


            case Const.RCB:

                Glide.with(mContext)
                        .load(mContext.getResources().getDrawable(R.drawable.rcb_icon))
                        .into(team2Img);

                break;
        }
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
