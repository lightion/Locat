package com.lightion.locat.models;

/**
 * Created by Lightion on 11-11-2017.
 */

public class ChatCards {
    private int chatIcon;
    private String chatTitle;
    private String lastMsg;
    private boolean showEye;

    public ChatCards() {
    }

    public ChatCards(int chatIcon, String chatTitle, String lastMsg, boolean showEye) {
        this.chatIcon = chatIcon;
        this.chatTitle = chatTitle;
        this.lastMsg = lastMsg;
        this.showEye = showEye;
    }

    public int getChatIcon() {
        return chatIcon;
    }

    public String getChatTitle() {
        return chatTitle;
    }

    public String getLastMsg() {
        return lastMsg;
    }

    public boolean isShowEye() {
        return showEye;
    }
}
