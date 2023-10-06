package com.example.helloworld;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.adapter.MyFirstAdapter;
import com.example.helloworld.utils.CommonUtil;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView lv_am31 = findViewById(R.id.lv_am31);
        try {
            lv_am31.setAdapter(new MyFirstAdapter(this, CommonUtil.getAppInfo(this)));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }

        Button bt_jump2car = findViewById(R.id.bt_jump2car);
        bt_jump2car.setOnClickListener(view -> {
            startActivity(new Intent(this, CarActivity.class));
        });
    }






}