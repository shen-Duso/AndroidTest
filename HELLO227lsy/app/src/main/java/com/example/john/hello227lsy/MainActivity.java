package com.example.john.hello227lsy;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tvinfo;//获取控件 1声明
    private Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取控件 2获取
        tvinfo=(TextView)findViewById(R.id.textView);
        btnok=(Button)findViewById(R.id.button);
    }
}
