package com.swufestu.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    TextView tvResult;
    EditText txt1;
    EditText txt2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }
    public void setViews() {
        tvResult = (TextView) findViewById(R.id.tvResult);
        txt1 = (EditText)findViewById(R.id.edX);
        txt2 = (EditText)findViewById(R.id.edY);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        double x = Double.parseDouble(txt1.getText().toString());//身高
        double y = Double.parseDouble(txt2.getText().toString());//体重//体重除以身高的平方
        double res;
        String str = "你的BIM是";
        if(x<=0 || y<=0) {
            tvResult.setText("值异常，不计算");
            return ;
        }
        x = x/100;
        res = y / (x*x);
        String str1 = String.format("%.2f",res);
        str = str + str1;
        tvResult.setText(str);
    }
}