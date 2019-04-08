package com.example.madmovegame.home.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.madmovegame.R;
import com.example.madmovegame.home.model.AllSports;
import com.example.madmovegame.home.model.Sport;
import com.example.madmovegame.util.HomeUtil;

import java.util.List;

public class AllSportsListAdapter extends RecyclerView.Adapter<AllSportsListAdapter.SportsViewHolder> {

    private Context mContext;
    private List<AllSports> sportList;
    private SportsListAdapterListener mListener;

    public AllSportsListAdapter() {

    }

    public AllSportsListAdapter(Context mContext, List<AllSports> sportList, SportsListAdapterListener mListener) {
        this.mContext = mContext;
        this.sportList = sportList;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_allsports, viewGroup, false);
        return new SportsViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder sportsViewHolder, int i) {
        final AllSports sport = sportList.get(i);
        sportsViewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemClick(sport);
            }
        });

        sportsViewHolder.team1Name.setText(sport.getTeam1());
        sportsViewHolder.team2Name.setText(sport.getTeam2());
        //sportsViewHolder.timeleft.setText(sport.getTimeleft() + "");
        sportsViewHolder.leagueName.setText(sport.getLeagueName());

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportsViewHolder extends RecyclerView.ViewHolder {

        View view;
        ImageView tema1Img, team2Img;
        TextView team1Name, team2Name, timeleft, leagueName;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            tema1Img = view.findViewById(R.id.team1_image);
            team2Img = view.findViewById(R.id.team2_image);
            team1Name = view.findViewById(R.id.team1_name);
            team2Name = view.findViewById(R.id.team2_name);
            timeleft = view.findViewById(R.id.time_left);
            leagueName = view.findViewById(R.id.league_name);

        }
    }

    public interface SportsListAdapterListener {

        void onItemClick(AllSports allSports);
    }

}
