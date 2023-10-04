package com.example.helloworld;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.utils.DateUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("你好,世界!!!!!");
    }

    public void doClick(View view) {
        String desc = String.format("%s  : %s", DateUtil.getNowTime(), ((Button) view).getText());
        TextView tv_click_res = findViewById(R.id.tv_click_res);
        tv_click_res.setText(desc);
    }


}