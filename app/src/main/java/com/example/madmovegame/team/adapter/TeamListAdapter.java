package com.example.madmovegame.team.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.madmovegame.Const;
import com.example.madmovegame.R;
import com.example.madmovegame.payment.model.Payment;
import com.example.madmovegame.team.model.Team;
import com.example.madmovegame.util.MockData;

import java.util.List;

public class TeamListAdapter extends RecyclerView.Adapter<TeamListAdapter.TeamListViewHolder> {

    private Context mContext;
    private List<Team> paymentList;

    public TeamListAdapter() {

    }

    public TeamListAdapter(Context mContext) {
        this.mContext = mContext;
        this.paymentList = MockData.getTeamInfo();
    }

    @NonNull
    @Override
    public TeamListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_team_info, viewGroup, false);
        return new TeamListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TeamListViewHolder rankListViewHolder, int i) {
        final Team team = paymentList.get(i);
        rankListViewHolder.playerName.setText(team.getPalyerName());
        rankListViewHolder.point.setText(team.getPoint());
        rankListViewHolder.credit.setText(team.getCredits());

        switch (team.getPalyerName()) {

            case "M Dhoni":
                break;

            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return paymentList.size();
    }

    public class TeamListViewHolder extends RecyclerView.ViewHolder {

        View view;
        TextView playerName, point, credit;
        ImageView playerImg, add;

        public TeamListViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            playerName = view.findViewById(R.id.player_name);
            point = view.findViewById(R.id.point);
            credit = view.findViewById(R.id.credit);
            playerImg = view.findViewById(R.id.player_img);
            add = view.findViewById(R.id.add_bt);

        }
    }


}