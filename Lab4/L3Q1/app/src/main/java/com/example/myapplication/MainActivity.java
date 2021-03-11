package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String countryNames[] = {
            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop"
    };


    private String capitalNames[] = {
            "1.5",
            "1.6",
            "2.0",
            "2.2",
            "2.3",
            "3.0",
            "4.0",
            "4.2",
            "4.4",
            "5.0"
    };


    private Integer imageid[] = {
            R.drawable.and1,
            R.drawable.and2,
            R.drawable.and3,
            R.drawable.and4,
            R.drawable.and5,
            R.drawable.and6,
            R.drawable.and7,
            R.drawable.and8,
            R.drawable.and9,
            R.drawable.and10

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Countries");

        //ListView listView=(ListView)findViewById(android.R.id.list);
        //listView.addHeaderView(textView);

        // For populating list data
        myAdapter android = new myAdapter(this, countryNames, capitalNames, imageid);
        listView.setAdapter(android);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+countryNames[position-1],Toast.LENGTH_SHORT).show();        }
        });
    }
}