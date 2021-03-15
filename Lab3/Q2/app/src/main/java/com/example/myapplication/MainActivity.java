package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.gridView);

        ArrayList<courseModel> courseModelArrayList = new ArrayList<courseModel>();
        courseModelArrayList.add(new courseModel("DSA"));
        courseModelArrayList.add(new courseModel("JAVA"));
        courseModelArrayList.add(new courseModel("C++"));
        courseModelArrayList.add(new courseModel("Python"));
        courseModelArrayList.add(new courseModel("Javascript"));
        courseModelArrayList.add(new courseModel("DSA"));

        adapterClass adapter = new adapterClass(this, courseModelArrayList);
        grid.setAdapter(adapter);
    }
}