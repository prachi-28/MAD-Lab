package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toBtn1;
    ToggleButton toBtn2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toBtn1=(ToggleButton)findViewById(R.id.toggleButton1);
        toBtn2=(ToggleButton)findViewById(R.id.toggleButton2);
        btn=(Button)findViewById(R.id.button);
        toBtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Context context=getApplicationContext();
                    CharSequence text="Silent Mode On!";
                    int duration= Toast.LENGTH_LONG;

                    Toast toast=Toast.makeText(context,text,duration);
                    toast.show();
                    toBtn2.setChecked(false);
                }


            }
        });

        toBtn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    Context context=getApplicationContext();
                    CharSequence text="Ringing Mode On!";
                    int duration= Toast.LENGTH_LONG;

                    Toast toast=Toast.makeText(context,text,duration);
                    toast.show();
                    toBtn1.setChecked(false);

                }

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toBtn1.isChecked())
                {
                    Context context=getApplicationContext();
                    CharSequence text="Changing to Ringing Mode";
                    int duration= Toast.LENGTH_LONG;

                    Toast toast=Toast.makeText(context,text,duration);
                    toast.show();
                    toBtn1.setChecked(false);
                    toBtn2.setChecked(true);

                }
                else
                {
                    Context context=getApplicationContext();
                    CharSequence text="Changing to Silent Mode!";
                    int duration= Toast.LENGTH_LONG;

                    Toast toast=Toast.makeText(context,text,duration);
                    toast.show();
                    toBtn1.setChecked(true);
                    toBtn2.setChecked(false);
                }
            }
        });


    }
}