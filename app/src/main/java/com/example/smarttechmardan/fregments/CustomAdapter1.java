package com.example.smarttechmardan.fregments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bilal on 8/15/2017.
 */

public class CustomAdapter1 extends BaseAdapter {

    private LayoutInflater layoutInflater1;
    private List<ItemObject1> listStorage1;
    private Context context1;

    public CustomAdapter1(Context context, List<ItemObject1> customizedListView){
        this.context1 = context;
        layoutInflater1 = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage1 = customizedListView;
    }
    @Override
    public int getCount() {
        return listStorage1.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CustomAdapter1.ViewHolder listViewHolder1;
        if (convertView == null){
            listViewHolder1 = new CustomAdapter1.ViewHolder();
            convertView = layoutInflater1.inflate(R.layout.dukaan,parent,false);
            listViewHolder1.screenShot1 = (ImageView)convertView.findViewById(R.id.screen_shot1);
            listViewHolder1.musicName1 = (TextView)convertView.findViewById(R.id.music_name1);
            listViewHolder1.musicAuthor1 = (TextView)convertView.findViewById(R.id.music_author1);

            convertView.setTag(listViewHolder1);
        }else{
            listViewHolder1 = (CustomAdapter1.ViewHolder) convertView.getTag();
        }
        listViewHolder1.screenShot1.setImageResource(listStorage1.get(position).getScreeenShot());
        listViewHolder1.musicName1.setText(listStorage1.get(position).getMusicName());
        listViewHolder1.musicAuthor1.setText(listStorage1.get(position).getMusicAuthor());
        return convertView;
    }

    static class ViewHolder{
        ImageView screenShot1;
        TextView musicName1;
        TextView musicAuthor1;
    }
}
