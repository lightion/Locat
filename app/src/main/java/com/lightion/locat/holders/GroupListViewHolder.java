package com.lightion.locat.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.lightion.locat.R;
import com.lightion.locat.models.GroupCards;

/**
 * Created by Lightion on 09-11-2017.
 */

public class GroupListViewHolder extends RecyclerView.ViewHolder {
    private ImageView groupIcon;
    public GroupListViewHolder(View itemView) {
        super(itemView);
        this.groupIcon=(ImageView)itemView.findViewById(R.id.groupIcon);
    }
    public void updateUI(GroupCards cards){
        this.groupIcon.setImageResource(R.mipmap.ic_launcher);
    }
}
