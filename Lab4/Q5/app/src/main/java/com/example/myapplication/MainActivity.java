package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    CheckBox b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        b1 = (CheckBox)findViewById(R.id.checkBox1);
        b2 = (CheckBox)findViewById(R.id.checkBox2);
        b3 = (CheckBox)findViewById(R.id.checkBox3);
        b4 = (CheckBox)findViewById(R.id.checkBox4);
        b5 = (CheckBox)findViewById(R.id.checkBox5);
        b6 = (CheckBox)findViewById(R.id.checkBox6);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int price=0;
                if(b1.isChecked())
                {
                    price=price+150;
                }
                if(b2.isChecked())
                {
                    price=price+200;
                }
                if(b3.isChecked())
                {
                    price=price+100;
                }
                if(b4.isChecked())
                {
                    price=price+300;
                }
                if(b5.isChecked())
                {
                    price=price+250;
                }
                if(b6.isChecked())
                {
                    price=price+190;
                }

                String s=Integer.toString(price);
                String text="Your total bill is: "+s;
                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();

                b1.setClickable(false);
                b2.setClickable(false);
                b3.setClickable(false);
                b4.setClickable(false);
                b5.setClickable(false);
                b6.setClickable(false);



            }
        });
    }
}