package com.example.john.widgettest_227lsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv;
    private EditText et;
    private Button btngettext,btnsettimg;
    private ImageButton ibtn;
    private ImageView iv;

private RadioButton rbnan,rbnv;
    private RadioGroup rg;
    private CheckBox cblan,cbzu,cbyou;
    private Button btngetender,btngetfun;
    private  String strfun=null;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        tv=(TextView)findViewById(R.id.textView3);
        et=(EditText)findViewById(R.id.editText3);
        btngettext=(Button)findViewById(R.id.button6);
        btnsettimg=(Button)findViewById(R.id.button7);
        iv=(ImageView)findViewById(R.id.imageView5);
        ibtn=(ImageButton)findViewById(R.id.imageButton2);
        btngettext.setOnClickListener(this);
        btnsettimg.setOnClickListener(this);
        ibtn.setOnClickListener(this);

        rbnan=(RadioButton)findViewById(R.id.radioButton2);
        rbnv=(RadioButton)findViewById(R.id.radioButton);
        rg=(RadioGroup) findViewById(R.id.radiogroup);
        cblan=(CheckBox) findViewById(R.id.checkBox2);
        cbzu=(CheckBox)findViewById(R.id.checkBox3);
        cbyou=(CheckBox) findViewById(R.id.checkBox4);
       btngetender=(Button) findViewById(R.id.button4);
        btngetfun=(Button)findViewById(R.id.button5);

        btngetender.setOnClickListener(this);
        btngetfun.setOnClickListener(this);
rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.radioButton:
                tv.setText("女");
                break;
            case R.id.radioButton2:
                tv.setText("男");
                break;
        }
    }
});
        cblan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)//checkbox
                strfun+="篮球+";
                else//checkboxmeiyougouxuan
                strfun=strfun.replace("篮球+","");
                tv.setText(strfun);
            }
        });
}




    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button6://文本按钮
                String str = et.getText().toString();
                tv.setText(str);
                break;
            case R.id.button7://图片
                iv.setImageResource(R.drawable.e);
                break;
            case R.id.imageButton2://图片按钮
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("paraml", et.getText().toString());
                intent.putExtra("param2", 10);
                startActivity(intent);
                break;
            case R.id.button4:
                if (rbnan.isChecked())
                    tv.setText("男");
                if (rbnan.isChecked())
                    tv.setText("女");
                break;
            case R.id.button5:
                String msg = " ";
                if (cblan.isChecked()) msg += "篮球+";
                if (cbzu.isChecked()) msg += "足球";
                if (cbyou.isChecked()) msg += "游泳+";
                tv.setText(msg);
                break;
        }


    }
}
