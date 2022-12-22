package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Jamu1 extends AppCompatActivity {
    TextView hal2jamu;
    TextView hal3jamu;

    CardView kartujamu1;
    CardView kartujamu2;
    CardView kartujamu3;
    CardView kartujamu4;
    CardView kartujamu5;
    CardView kartujamu6;

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamu1);

        hal2jamu = (TextView) findViewById(R.id.hal2fito);
        hal3jamu = (TextView) findViewById(R.id.hal3jamu);

        kartujamu1 = (CardView) findViewById(R.id.kartujamu1);
        kartujamu2 = (CardView) findViewById(R.id.kartujamu2);
        kartujamu3 = (CardView) findViewById(R.id.kartujamu3);
        kartujamu4 = (CardView) findViewById(R.id.kartujamu4);
        kartujamu5 = (CardView) findViewById(R.id.kartujamu5);
        kartujamu6 = (CardView) findViewById(R.id.kartujamu6);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener(view -> {
            Intent intMain = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intMain);
        });

        hal2jamu.setOnClickListener(view -> {
            Intent intHal2 = new Intent(getApplicationContext(), Jamu2.class);
            startActivity(intHal2);
        });

        hal3jamu.setOnClickListener(view -> {
            Intent intHal3 = new Intent(getApplicationContext(), Jamu3.class);
            startActivity(intHal3);
        });

        kartujamu1.setOnClickListener(view -> {
                Intent intJamu1 = new Intent(getApplicationContext(), ObatJamu1.class);
                startActivity(intJamu1);
        });

        kartujamu2.setOnClickListener(view -> {
                Intent intJamu2 = new Intent(getApplicationContext(), ObatJamu2.class);
                startActivity(intJamu2);
        });

        kartujamu3.setOnClickListener(view ->{
                Intent intJamu3 = new Intent(getApplicationContext(), ObatJamu3.class);
                startActivity(intJamu3);
        });

        kartujamu4.setOnClickListener(view -> {
                Intent intJamu4 = new Intent(getApplicationContext(), ObatJamu4.class);
                startActivity(intJamu4);
        });

        kartujamu5.setOnClickListener(view -> {
                Intent intJamu5 = new Intent(getApplicationContext(), ObatJamu5.class);
                startActivity(intJamu5);
        });

        kartujamu6.setOnClickListener(view -> {
                Intent intJamu6 = new Intent(getApplicationContext(), ObatJamu6.class);
                startActivity(intJamu6);
        });



    }
}