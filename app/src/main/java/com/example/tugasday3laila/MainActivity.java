package com.example.tugasday3laila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button lenovoButton = findViewById(R.id.btnLenovo);
        Button asusButton = findViewById(R.id.btnAsus);
        Button acerButton = findViewById(R.id.btnAcer);

        lenovoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LenovoActivity.class));
                    }
        });

        asusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AsusActivity.class));
                    }
                });

        acerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AcerActivity.class));
                    }
            });
        }
    }

