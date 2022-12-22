package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Fitofarmaka1 extends AppCompatActivity {

    CardView kartufito1;
    CardView kartufito2;
    CardView kartufito3;
    CardView kartufito4;
    CardView kartufito5;
    CardView kartufito6;

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitofarmaka1);

        kartufito1 = (CardView) findViewById(R.id.kartufito1);
        kartufito2 = (CardView) findViewById(R.id.kartufito2);
        kartufito3 = (CardView) findViewById(R.id.kartufito3);
        kartufito4 = (CardView) findViewById(R.id.kartufito4);
        kartufito5 = (CardView) findViewById(R.id.kartufito5);
        kartufito6 = (CardView) findViewById(R.id.kartufito6);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener(view -> {
            Intent intMain = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intMain);
        });

        kartufito1.setOnClickListener(view -> {
            Intent intFito1 = new Intent(getApplicationContext(), ObatFito1.class);
            startActivity(intFito1);
        });

        kartufito2.setOnClickListener(view -> {
            Intent intFito2 = new Intent(getApplicationContext(), ObatFito2.class);
            startActivity(intFito2);
        });

        kartufito3.setOnClickListener(view -> {
            Intent intFito3 = new Intent(getApplicationContext(), ObatFito3.class);
            startActivity(intFito3);
        });

        kartufito4.setOnClickListener(view -> {
            Intent intFito4 = new Intent(getApplicationContext(), ObatFito4.class);
            startActivity(intFito4);
        });

        kartufito5.setOnClickListener(view -> {
            Intent intFito5 = new Intent(getApplicationContext(), ObatFito5.class);
            startActivity(intFito5);
        });

        kartufito6.setOnClickListener(view -> {
            Intent intFito6 = new Intent(getApplicationContext(), ObatFito6.class);
            startActivity(intFito6);
        });
    }
}