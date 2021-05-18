package com.example.john.widgettest_227lsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnContextClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent intent = getIntent();
        String str = intent.getStringExtra("paraml");
        int n = intent.getIntExtra("param2", 10);
        System.out.println(str + "---" + String.valueOf(n));
        Toast.makeText(this, str + "---" + String.valueOf(n), Toast.LENGTH_SHORT).show();
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(str + "---" + String.valueOf(n));
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                finish();
                break;

        }
    }
}