package com.example.smarttechmardan.fregments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PopMusic extends Fragment {


    public PopMusic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pop_music, container, false);
        GridView gridView=(GridView)view.findViewById(R.id.gridview);

        List<ItemObject> allItems = getAllItemObject();
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), allItems);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Position:"+position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
    private List<ItemObject>getAllItemObject(){
        List<ItemObject>items = new ArrayList<>();
        items.add(new ItemObject(R.drawable.a1,"KLOC","1"));
        items.add(new ItemObject(R.drawable.a2,"FlashLight","2"));
        items.add(new ItemObject(R.drawable.a3,"Model","3"));
        items.add(new ItemObject(R.drawable.a1,"KLOC","4"));
        items.add(new ItemObject(R.drawable.a2,"FlashLight","5"));
        items.add(new ItemObject(R.drawable.a3,"Model","6"));
        items.add(new ItemObject(R.drawable.a1,"KLOC","7"));

        return items;
    }

    
}
