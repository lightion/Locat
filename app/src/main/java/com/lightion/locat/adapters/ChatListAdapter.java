package com.lightion.locat.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightion.locat.R;
import com.lightion.locat.holders.ChatListViewHolder;
import com.lightion.locat.models.ChatCards;
import com.lightion.locat.models.GroupCards;

import java.util.ArrayList;

/**
 * Created by Lightion on 10-11-2017.
 */

public class ChatListAdapter extends RecyclerView.Adapter<ChatListViewHolder> {

    ArrayList<ChatCards> chatList;

    public ChatListAdapter(ArrayList<ChatCards> chatList) {
        this.chatList = chatList;
    }


    @Override
    public ChatListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View chatCard= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_chat_list, parent, false);
        return new ChatListViewHolder(chatCard);
    }

    @Override
    public void onBindViewHolder(ChatListViewHolder holder, int position) {
        final ChatCards cards=chatList.get(position);
        holder.updateUI(cards);
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }
}
