package com.example.madmovegame.payment.adapter;

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
import com.example.madmovegame.util.MockData;

import java.util.List;

public class PaymentListAdapter extends RecyclerView.Adapter<PaymentListAdapter.RankListViewHolder> {

    private Context mContext;
    private List<Payment> paymentList;

    public PaymentListAdapter() {

    }

    public PaymentListAdapter(Context mContext) {
        this.mContext = mContext;

        this.paymentList = MockData.getPaymentInfo();
    }

    @NonNull
    @Override
    public RankListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_payment_info, viewGroup, false);
        return new RankListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RankListViewHolder rankListViewHolder, int i) {
        final Payment payment = paymentList.get(i);
        rankListViewHolder.paymentName.setText(payment.getPaymentName());

        switch (payment.getPaymentName()) {

            case Const.UPI:
                break;

            case Const.WALLET:
                break;

            case Const.NET_BANKING:
                break;

            case Const.CARD:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return paymentList.size();
    }

    public class RankListViewHolder extends RecyclerView.ViewHolder {

        View view;
        TextView paymentName;
        ImageView paymentImg;

        public RankListViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            paymentName = view.findViewById(R.id.payment_name);
            paymentImg = view.findViewById(R.id.payment_img);

        }
    }


}
