package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Jamu3 extends AppCompatActivity {

    TextView hal1jamu;
    TextView hal2jamu;

    CardView kartujamu13;
    CardView kartujamu14;
    CardView kartujamu15;
    CardView kartujamu16;
    CardView kartujamu17;
    CardView kartujamu18;

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamu3);

        hal1jamu = (TextView) findViewById(R.id.hal1oht);
        hal2jamu = (TextView) findViewById(R.id.hal2fito);

        kartujamu13 = (CardView) findViewById(R.id.kartujamu13);
        kartujamu14 = (CardView) findViewById(R.id.kartujamu14);
        kartujamu15 = (CardView) findViewById(R.id.kartujamu15);
        kartujamu16 = (CardView) findViewById(R.id.kartujamu16);
        kartujamu17 = (CardView) findViewById(R.id.kartujamu17);
        kartujamu18 = (CardView) findViewById(R.id.kartujamu18);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener(view -> {
            Intent intMain = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intMain);
        });

        hal1jamu.setOnClickListener(view ->  {
                Intent intHal1 = new Intent(getApplicationContext(), Jamu1.class);
                startActivity(intHal1);
        });

        hal2jamu.setOnClickListener(view ->  {
                Intent intHal2 = new Intent(getApplicationContext(), Jamu2.class);
                startActivity(intHal2);
        });

        kartujamu13.setOnClickListener(view -> {
            Intent intJamu13 = new Intent(getApplicationContext(), ObatJamu13.class);
            startActivity(intJamu13);
        });

        kartujamu14.setOnClickListener(view -> {
            Intent intJamu14 = new Intent(getApplicationContext(), ObatJamu14.class);
            startActivity(intJamu14);
        });

        kartujamu15.setOnClickListener(view -> {
            Intent intJamu15 = new Intent(getApplicationContext(), ObatJamu15.class);
            startActivity(intJamu15);
        });

        kartujamu16.setOnClickListener(view -> {
            Intent intJamu16 = new Intent(getApplicationContext(), ObatJamu16.class);
            startActivity(intJamu16);
        });

        kartujamu17.setOnClickListener(view -> {
            Intent intJamu17 = new Intent(getApplicationContext(), ObatJamu17.class);
            startActivity(intJamu17);
        });

        kartujamu18.setOnClickListener(view -> {
            Intent intJamu18= new Intent(getApplicationContext(), ObatJamu18.class);
            startActivity(intJamu18);
        });

    }
}