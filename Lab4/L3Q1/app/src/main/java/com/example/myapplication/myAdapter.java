package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class myAdapter extends ArrayAdapter {
    private String[] androidNames;
    private String[] versionNames;
    private Integer[] imageid;

    private Activity context;

    public myAdapter(Activity context, String[] countryNames, String[] capitalNames, Integer[] imageid) {
        super(context, R.layout.row_item, countryNames);
        this.context = context;
        this.androidNames = countryNames;
        this.versionNames = capitalNames;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewCountry = (TextView) row.findViewById(R.id.name);
        TextView textViewCapital = (TextView) row.findViewById(R.id.version);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.image);

        textViewCountry.setText(androidNames[position]);
        textViewCapital.setText(versionNames[position]);
        imageFlag.setImageResource(imageid[position]);
        return  row;
    }
}
