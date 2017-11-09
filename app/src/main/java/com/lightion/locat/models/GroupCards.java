package com.lightion.locat.models;

/**
 * Created by Lightion on 09-11-2017.
 */

public class GroupCards {
    private String groupTitle;
    private int groupIcon;
    private String groupDescription;
    private int groupDistance;

    public GroupCards() {
    }

    public GroupCards(String groupTitle, int groupIcon, String groupDescription, int groupDistance) {
        this.groupTitle = groupTitle;
        this.groupIcon = groupIcon;
        this.groupDescription = groupDescription;
        this.groupDistance = groupDistance;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public int getGroupIcon() {
        return groupIcon;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public int getGroupDistance() {
        return groupDistance;
    }
}
