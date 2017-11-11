package com.lightion.locat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightion.locat.R;
import com.lightion.locat.adapters.AskListAdapter;
import com.lightion.locat.models.AskCards;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AskFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AskListAdapter adapter;
    private ArrayList<AskCards>list;
    public AskFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_ask, container, false);
        list=new ArrayList<>();
        list.add(new AskCards("Puchna Chutiye", "Puchh raha hoo Bhenchod"));
        list.add(new AskCards("Sex in Hindi", "What is the translation of sex in hindi?"));
        list.add(new AskCards("Hot Girls","Are there any hot girls in this location?"));
        recyclerView = v.findViewById(R.id.askListRecyclerView);
        layoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter=new AskListAdapter(list);
        recyclerView.setAdapter(adapter);
        return v;
    }

}
