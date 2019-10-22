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
public class Dukaan1Fragment extends Fragment {


    public Dukaan1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dukaan1, container, false);
        GridView gridView=(GridView)view.findViewById(R.id.gridview);

        List<ItemObject1> allItems1 = getAllItemObject1();
        CustomAdapter1 customAdapter = new CustomAdapter1(getActivity(), allItems1);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Position:"+position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    private List<ItemObject1> getAllItemObject1(){
        List<ItemObject1>items1 = new ArrayList<>();
        items1.add(new ItemObject1(R.drawable.a1,"KLOC","1"));
        items1.add(new ItemObject1(R.drawable.a2,"FlashLight","2"));
        items1.add(new ItemObject1(R.drawable.a3,"Model","3"));
        items1.add(new ItemObject1(R.drawable.a1,"KLOC","4"));
        items1.add(new ItemObject1(R.drawable.a2,"FlashLight","5"));
        items1.add(new ItemObject1(R.drawable.a3,"Model","6"));
        items1.add(new ItemObject1(R.drawable.a1,"KLOC","7"));
        items1.add(new ItemObject1(R.drawable.a3,"Model","8"));
        items1.add(new ItemObject1(R.drawable.a1,"KLOC","9"));
        items1.add(new ItemObject1(R.drawable.a2,"FlashLight","10"));

        return items1;
    }

}
