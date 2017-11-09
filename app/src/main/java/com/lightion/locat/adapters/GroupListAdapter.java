package com.lightion.locat.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightion.locat.R;
import com.lightion.locat.holders.GroupListViewHolder;
import com.lightion.locat.models.GroupCards;

import java.util.ArrayList;

/**
 * Created by Lightion on 09-11-2017.
 */

public class GroupListAdapter extends RecyclerView.Adapter<GroupListViewHolder> {
    ArrayList<GroupCards> groupList=null;

    public GroupListAdapter(ArrayList<GroupCards> groupList) {
        this.groupList = groupList;
    }

    @Override
    public GroupListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View groupCard= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_group_list, parent, false);
        return new GroupListViewHolder(groupCard);
    }

    @Override
    public void onBindViewHolder(GroupListViewHolder holder, int position) {
        final GroupCards cards=groupList.get(position);
        holder.updateUI(cards);
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }
}
