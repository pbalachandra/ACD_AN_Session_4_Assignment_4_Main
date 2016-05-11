package com.acadgild.balu.acd_an_session_4_assignment_4_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BALU on 5/10/2016.
 */
public class CustomAdapter extends BaseAdapter
{
    LayoutInflater layoutInflater;

    public Integer[] images = {R.drawable.gingerbread, R.drawable.honeycomb,
                               R.drawable.icecream, R.drawable.jellybean,
                               R.drawable.kitkat, R.drawable.lollipop};

    public Integer[] titles = {R.string.gingerbread, R.string.honeycomb,
                               R.string.icecream, R.string.jellybean,
                               R.string.kitkat, R.string.lollipop};

    public CustomAdapter(Context context)
    {
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return images.length;
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
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.versions, parent, false);

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);

            imageView.setImageResource(images[position]);
            textView.setText(titles[position]);
        }

        return convertView;
    }
}
