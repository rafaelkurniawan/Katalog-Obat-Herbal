package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Oht1 extends AppCompatActivity {

    CardView kartuoht1;
    CardView kartuoht2;
    CardView kartuoht3;
    CardView kartuoht4;
    CardView kartuoht5;
    CardView kartuoht6;

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oht1);

        kartuoht1 = (CardView) findViewById(R.id.kartuoht1);
        kartuoht2 = (CardView) findViewById(R.id.kartuoht2);
        kartuoht3 = (CardView) findViewById(R.id.kartuoht3);
        kartuoht4 = (CardView) findViewById(R.id.kartuoht4);
        kartuoht5 = (CardView) findViewById(R.id.kartuoht5);
        kartuoht6 = (CardView) findViewById(R.id.kartuoht6);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener(view -> {
            Intent intMain = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intMain);
        });

        kartuoht1.setOnClickListener(view -> {
            Intent intOht1 = new Intent(getApplicationContext(), ObatOHT1.class);
            startActivity(intOht1);
        });

        kartuoht2.setOnClickListener(view -> {
            Intent intOht2 = new Intent(getApplicationContext(), ObatOHT2.class);
            startActivity(intOht2);
        });

        kartuoht3.setOnClickListener(view -> {
            Intent intOht3 = new Intent(getApplicationContext(), ObatOHT3.class);
            startActivity(intOht3);
        });

        kartuoht4.setOnClickListener(view -> {
            Intent intOht4 = new Intent(getApplicationContext(), ObatOHT4.class);
            startActivity(intOht4);
        });

        kartuoht5.setOnClickListener(view -> {
            Intent intOht5 = new Intent(getApplicationContext(), ObatOHT5.class);
            startActivity(intOht5);
        });

        kartuoht6.setOnClickListener(view -> {
            Intent intOht6 = new Intent(getApplicationContext(), ObatOHT6.class);
            startActivity(intOht6);
        });

    }
}