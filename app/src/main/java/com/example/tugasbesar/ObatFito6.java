package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ObatFito6 extends AppCompatActivity {

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_fito6);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener( view -> {
            Intent intFito1 = new Intent(getApplicationContext(), Fitofarmaka1.class);
            startActivity(intFito1);
        });
    }
}