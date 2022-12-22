package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ObatOHT6 extends AppCompatActivity {

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_oht6);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener( view -> {
            Intent intOht1 = new Intent(getApplicationContext(), Oht1.class);
            startActivity(intOht1);
        });
    }
}