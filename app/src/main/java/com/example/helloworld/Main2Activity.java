package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author fei
 * @since 2023/09/11 22:59
 */
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv_second_hello = findViewById(R.id.tv_second_hello);
        tv_second_hello.setText(R.string.second_name);
    }
}
