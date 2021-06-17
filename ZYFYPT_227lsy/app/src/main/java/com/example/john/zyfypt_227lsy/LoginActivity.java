package com.example.john.zyfypt_227lsy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
String msg="hello";
        Toast.makeText(this, "这是一个测试", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
