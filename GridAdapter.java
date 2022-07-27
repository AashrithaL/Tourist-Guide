package com.bignerdranch.android.listdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter{

    Context context;
    String[] picname;
    int[] image;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] picname, int[] image) {
        this.context = context;
        this.picname = picname;
        this.image = image;
    }

    @Override
    public int getCount() {
        return picname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item, null);
        }

        ImageView imageview = convertView.findViewById(R.id.grid_image);
        TextView textview = convertView.findViewById(R.id.item_name);

        imageview.setImageResource(image[position]);
        textview.setText(picname[position]);

        return convertView;
    }

}

