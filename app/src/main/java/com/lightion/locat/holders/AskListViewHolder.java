package com.lightion.locat.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lightion.locat.R;
import com.lightion.locat.models.AskCards;

/**
 * Created by Lightion on 11-11-2017.
 */

public class AskListViewHolder extends RecyclerView.ViewHolder {
    private TextView askTitle, askQuestion;
    public AskListViewHolder(View itemView) {
        super(itemView);
        askTitle=itemView.findViewById(R.id.askTitle);
        askQuestion=itemView.findViewById(R.id.askQuestion);
    }
    public void updateUI(AskCards cards){
        askTitle.setText(cards.getAskTitle());
        askQuestion.setText(cards.getAskQuestion());
    }
}
