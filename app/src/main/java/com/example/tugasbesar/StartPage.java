package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class StartPage extends AppCompatActivity {
    ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        play = (ImageView)findViewById(R.id.play);

        play.setOnClickListener(view ->  {
                Intent intMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intMain);
        });
    }
}