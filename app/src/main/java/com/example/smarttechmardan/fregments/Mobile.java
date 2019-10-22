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
public class Mobile extends Fragment {


    public Mobile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mobile, container, false);
        GridView gridView=(GridView)view.findViewById(R.id.gridview1);

        List<ItemObject> allItems = getAllItemObject1();
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
    private List<ItemObject>getAllItemObject1(){
        List<ItemObject>items = new ArrayList<>();
        items.add(new ItemObject(R.drawable.a1,"KLOC","Malaysia"));
        items.add(new ItemObject(R.drawable.a2,"FlashLight","icon"));
        items.add(new ItemObject(R.drawable.a3,"Model","KLOC"));

        return items;
    }

}
