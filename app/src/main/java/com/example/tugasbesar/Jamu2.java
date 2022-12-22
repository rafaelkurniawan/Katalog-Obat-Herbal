package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Jamu2 extends AppCompatActivity {
    TextView hal1jamu;
    TextView hal3jamu;

    CardView kartujamu7;
    CardView kartujamu8;
    CardView kartujamu9;
    CardView kartujamu10;
    CardView kartujamu11;
    CardView kartujamu12;

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamu2);

        hal1jamu = (TextView) findViewById(R.id.hal1oht);
        hal3jamu = (TextView) findViewById(R.id.hal3jamu);

        kartujamu7 = (CardView) findViewById(R.id.kartujamu7);
        kartujamu8 = (CardView) findViewById(R.id.kartujamu8);
        kartujamu9 = (CardView) findViewById(R.id.kartujamu9);
        kartujamu10 = (CardView) findViewById(R.id.kartujamu10);
        kartujamu11 = (CardView) findViewById(R.id.kartujamu11);
        kartujamu12 = (CardView) findViewById(R.id.kartujamu12);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener(view -> {
            Intent intMain = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intMain);
        });

        hal1jamu.setOnClickListener(view -> {
            Intent intHal1 = new Intent(getApplicationContext(), Jamu1.class);
            startActivity(intHal1);
        });

        hal3jamu.setOnClickListener(view -> {
            Intent intHal3 = new Intent(getApplicationContext(), Jamu3.class);
            startActivity(intHal3);
        });

        kartujamu7.setOnClickListener(view -> {
                Intent intJamu7 = new Intent(getApplicationContext(), ObatJamu7.class);
                startActivity(intJamu7);
        });

        kartujamu8.setOnClickListener(view -> {
                Intent intJamu8 = new Intent(getApplicationContext(), ObatJamu8.class);
                startActivity(intJamu8);
        });

        kartujamu9.setOnClickListener(view ->  {
                Intent intJamu9 = new Intent(getApplicationContext(), ObatJamu9.class);
                startActivity(intJamu9);
        });

        kartujamu10.setOnClickListener(view -> {
                Intent intJamu10 = new Intent(getApplicationContext(), ObatJamu10.class);
                startActivity(intJamu10);
        });

        kartujamu11.setOnClickListener(view ->  {
                Intent intJamu11 = new Intent(getApplicationContext(), ObatJamu11.class);
                startActivity(intJamu11);
        });

        kartujamu12.setOnClickListener(view ->  {
                Intent intJamu12 = new Intent(getApplicationContext(), ObatJamu12.class);
                startActivity(intJamu12);
        });

    }
}