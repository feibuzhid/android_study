package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.utils.DateUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("你好,世界!!!!!");

        Button bt_click2jump1 = findViewById(R.id.bt_click2jump1);
        bt_click2jump1.setOnClickListener(this);

        Button bt_click2jump2 = findViewById(R.id.bt_click2jump2);
        bt_click2jump2.setOnClickListener(this);
    }

    /**
     * use for button bt_click2jump_xml
     * @param view view
     */
    public void doClick(View view) {
        String desc = String.format("%s  : %s", DateUtil.getNowTime(), ((Button) view).getText());
        TextView tv_click_res = findViewById(R.id.tv_click_res);
        tv_click_res.setText(desc);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        if (view.getId() == R.id.bt_click2jump1) {
            intent = new Intent(this, Main2Activity.class);
        }
        if (view.getId() == R.id.bt_click2jump2) {
            intent = new Intent(this, Main3Activity.class);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }


}