package com.lightion.locat.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightion.locat.R;
import com.lightion.locat.holders.AskListViewHolder;
import com.lightion.locat.models.AskCards;

import java.util.ArrayList;

/**
 * Created by Lightion on 11-11-2017.
 */

public class AskListAdapter extends RecyclerView.Adapter<AskListViewHolder> {
    ArrayList<AskCards> askList;

    public AskListAdapter(ArrayList<AskCards> askList) {
        this.askList = askList;
    }

    @Override
    public AskListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View askCard= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_ask_list, parent, false);
        return new AskListViewHolder(askCard);
    }

    @Override
    public void onBindViewHolder(AskListViewHolder holder, int position) {
        AskCards card = askList.get(position);
        holder.updateUI(card);
    }

    @Override
    public int getItemCount() {
        return askList.size();
    }
}
