package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button bt_jump2car = findViewById(R.id.bt_jump2car);
        bt_jump2car.setOnClickListener(view -> {
            startActivity(new Intent(this, CarActivity.class));
        });
    }



}