package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("你好,世界!!!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        goNextPage();
    }

    private void goNextPage() {
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("3秒后进入下一个页面");
        new Handler().postDelayed(
                () -> startActivity(
                        new Intent(MainActivity.this, Main2Activity.class)),
                3000);
    }
}