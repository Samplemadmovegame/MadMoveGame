package com.example.madmovegame.contest;

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

import com.example.madmovegame.R;
import com.example.madmovegame.contest.adapter.RankListAdapter;
import com.example.madmovegame.contest.model.Contest;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ContestInfo.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ContestInfo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContestInfo extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private Contest mParam1;
    private RecyclerView mRankRecyclerView;
    private RankListAdapter mRankListAdapter;


    private OnFragmentInteractionListener mListener;

    public ContestInfo() {
        // Required empty public constructor
    }


    public static ContestInfo newInstance(Contest contest) {
        ContestInfo fragment = new ContestInfo();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, contest);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getParcelable(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_contest_info, container, false);
        mRankRecyclerView=view.findViewById(R.id.rank_recycler_view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpRankAdapter();
    }

    public void setUpRankAdapter(){

        mRankListAdapter=new RankListAdapter(getActivity(),new RankListAdapter.RankListAdapterListener(){
            @Override
            public void onItemClick(Contest contest) {

            }
        });
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRankRecyclerView.setLayoutManager(mLayoutManager);
        mRankRecyclerView.setAdapter(mRankListAdapter);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void openContestInfo(Contest contest);
    }
}
