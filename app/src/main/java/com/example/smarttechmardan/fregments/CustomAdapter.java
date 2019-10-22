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
 * Created by Smart Tech  Mardan on 7/18/2017.
 */

public class CustomAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<ItemObject> listStorage;
    private Context context;

    public CustomAdapter(Context context,List<ItemObject> customizedListView){
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
    }

    @Override
    public int getCount() {
        return listStorage.size();
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

        ViewHolder listViewHolder;
        if (convertView == null){
            listViewHolder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.pop_music_list,parent,false);
            listViewHolder.screenShot = (ImageView)convertView.findViewById(R.id.screen_shot1);
            listViewHolder.musicName = (TextView)convertView.findViewById(R.id.music_name);
            listViewHolder.musicAuthor = (TextView)convertView.findViewById(R.id.music_author);

            convertView.setTag(listViewHolder);
        }else{
            listViewHolder = (ViewHolder)convertView.getTag();
        }

        listViewHolder.screenShot.setImageResource(listStorage.get(position).getScreeenShot());
        listViewHolder.musicName.setText(listStorage.get(position).getMusicName());
        listViewHolder.musicAuthor.setText(listStorage.get(position).getMusicAuthor());
        return convertView;
    }

    static class ViewHolder{
        ImageView screenShot;
        TextView musicName;
        TextView musicAuthor;
    }
}
