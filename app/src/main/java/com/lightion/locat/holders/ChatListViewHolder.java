package com.lightion.locat.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lightion.locat.R;
import com.lightion.locat.models.ChatCards;

/**
 * Created by Lightion on 10-11-2017.
 */

public class ChatListViewHolder extends RecyclerView.ViewHolder {

    private ImageView chatIcon;
    private TextView chatTitle;
    private TextView chatLastMsg;
    private ImageView eyeImage;

    public ChatListViewHolder(View itemView) {
        super(itemView);
        chatIcon=itemView.findViewById(R.id.chatIcon);
        chatTitle=itemView.findViewById(R.id.chatTitle);
        chatLastMsg=itemView.findViewById(R.id.chatLastMsg);
        eyeImage=itemView.findViewById(R.id.eye);
    }
    public void updateUI(ChatCards cards){
        chatIcon.setImageResource(cards.getChatIcon());
        chatTitle.setText(cards.getChatTitle());
        chatLastMsg.setText(cards.getLastMsg());
        if(!cards.isShowEye()){
            eyeImage.setVisibility(View.INVISIBLE);
        }
    }
}
