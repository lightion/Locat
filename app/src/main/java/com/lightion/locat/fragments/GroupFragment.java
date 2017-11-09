package com.lightion.locat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightion.locat.R;
import com.lightion.locat.adapters.GroupListAdapter;
import com.lightion.locat.models.GroupCards;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GroupFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private GroupListAdapter adapter;
    private ArrayList<GroupCards> list;

    public GroupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_group, container, false);
        list=new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(new GroupCards());
        }
        recyclerView=v.findViewById(R.id.groupListRecyclerView);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter=new GroupListAdapter(list);
        recyclerView.setAdapter(adapter);
        return v;
    }

}
