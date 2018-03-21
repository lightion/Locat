package com.lightion.locat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightion.locat.R;
import com.lightion.locat.adapters.ChatListAdapter;
import com.lightion.locat.models.ChatCards;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatListFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ChatListAdapter adapter;
    private ArrayList<ChatCards> list;

    public ChatListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_chat_list, container, false);
        list=new ArrayList<>();
        list.add(new ChatCards(R.mipmap.ic_launcher, "BedaGarg", "Message aa gaya bhai", true ));
        list.add(new ChatCards(R.mipmap.ic_launcher, "Raes Bekaar Movie", "Ghathiya thi", false ));
        recyclerView=v.findViewById(R.id.chatListRecyclerView);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter=new ChatListAdapter(list);
        recyclerView.setAdapter(adapter);
        return v;
    }

}
