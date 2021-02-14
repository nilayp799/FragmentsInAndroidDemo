package com.example.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    FragmentTransaction transaction = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);

        btn1.setBackgroundColor(Color.TRANSPARENT);
        btn2.setBackgroundColor(Color.TRANSPARENT);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragment1 = new FragmentOne();
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,fragment1);
                transaction.commit();
                btn1.setBackgroundColor(Color.RED);
                btn2.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragment2 = new FragmentTwo();
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,fragment2);
                transaction.commit();
                btn2.setBackgroundColor(Color.RED);
                btn1.setBackgroundColor(Color.TRANSPARENT);
            }
        });
    }
}