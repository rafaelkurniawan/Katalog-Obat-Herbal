package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ObatJamu18 extends AppCompatActivity {

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_jamu18);

        btn_back = (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener( view -> {
            Intent intJamu3 = new Intent(getApplicationContext(), Jamu3.class);
            startActivity(intJamu3);
        });
    }
}