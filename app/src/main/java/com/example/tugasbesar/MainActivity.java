package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CardView card1;
    CardView card2;
    CardView card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);

        card1.setOnClickListener(view ->  {
                Intent intMain = new Intent(getApplicationContext(), Jamu1.class);
                startActivity(intMain);
        });

        card2.setOnClickListener(view ->  {
                Intent intMain = new Intent(getApplicationContext(), Oht1.class);
                startActivity(intMain);
        });

        card3.setOnClickListener(view ->  {
                Intent intMain = new Intent(getApplicationContext(), Fitofarmaka1.class);
                startActivity(intMain);
        });
    }
}