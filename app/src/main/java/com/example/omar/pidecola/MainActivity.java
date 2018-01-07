package com.example.omar.pidecola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton Dar = (ImageButton) findViewById(R.id.imageButton3);
        Dar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DarActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Pedir = (ImageButton) findViewById(R.id.imageButton4);
        Pedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PedirActivity.class);
                startActivity(intent);
            }
        });
    }
}
