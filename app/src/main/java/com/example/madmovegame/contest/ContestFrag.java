package com.example.madmovegame.contest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.madmovegame.R;
import com.example.madmovegame.contest.adapter.ContestListAdapter;
import com.example.madmovegame.contest.model.Contest;


public class ContestFrag extends Fragment {

    public static final String TAG = "ConstestFrag";
    private RecyclerView mConstestRecyclerView;
    private ContestListAdapter mContestListAdapter;
    private OnContestFragmentInteractionListener mListener;

    public ContestFrag() {
        // Required empty public constructor
    }

    public static ContestFrag newInstance() {

        Bundle args = new Bundle();

        ContestFrag fragment = new ContestFrag();
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
        View view = inflater.inflate(R.layout.fragment_contest, container, false);
        mConstestRecyclerView = view.findViewById(R.id.constest_recycler_view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpConstestListAdapter();
    }

    private void setUpConstestListAdapter() {
        mContestListAdapter = new ContestListAdapter(getActivity(), new ContestListAdapter.ContestListAdapterListener() {
            @Override
            public void onItemClick(Contest contest) {
                mListener.openContestInfo(contest);

                Log.v("*1--","ckick");
            }
        });
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mConstestRecyclerView.setLayoutManager(mLayoutManager);
        mConstestRecyclerView.setAdapter(mContestListAdapter);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnContestFragmentInteractionListener) {
            mListener = (OnContestFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener=null;
    }

    public interface OnContestFragmentInteractionListener{
        void openContestInfo(Contest contest);
    }

}
