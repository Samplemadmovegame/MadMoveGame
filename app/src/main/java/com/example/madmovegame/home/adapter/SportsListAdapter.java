package com.example.madmovegame.home.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.madmovegame.R;
import com.example.madmovegame.home.model.Sport;
import com.example.madmovegame.util.HomeUtil;

import java.util.List;

public class SportsListAdapter extends RecyclerView.Adapter<SportsListAdapter.SportsViewHolder> {

    private Context mContext;
    private List<Sport> sportList;
    private SportsListAdapterListener mListener;

    public SportsListAdapter() {

    }

    public SportsListAdapter(Context mContext, SportsListAdapterListener mListener) {
        this.mContext = mContext;
        this.mListener = mListener;
        this.sportList = HomeUtil.getSortsList();
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_sport, viewGroup, false);
        return new SportsViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder sportsViewHolder, int i) {
        final Sport sport = sportList.get(i);
        sportsViewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemClick(sport.getName());
            }
        });

        sportsViewHolder.sportsName.setText(sport.getName());
        Log.v("*1--",sport.getName());

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportsViewHolder extends RecyclerView.ViewHolder {

        View view;
        ImageView sportsImage;
        TextView sportsName;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            sportsImage = view.findViewById(R.id.s_image);
            sportsName = view.findViewById(R.id.name);
        }
    }

    public interface SportsListAdapterListener {

        void onItemClick(String sportName);
    }

}