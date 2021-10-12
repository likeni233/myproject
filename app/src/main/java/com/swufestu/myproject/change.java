package com.swufestu.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        final Bundle bundle=getIntent().getExtras();    //接收Extras
        float ex_rate1 = bundle.getFloat("ex_rate1");
        float ex_rate2 = bundle.getFloat("ex_rate2");
        float ex_rate3 = bundle.getFloat("ex_rate3");

        EditText rate1 = (EditText) findViewById(R.id.ex_rate1);
        rate1.setText(""+ex_rate1);
        EditText rate2 = (EditText) findViewById(R.id.ex_rate2);
        rate2.setText(""+ex_rate2);
        EditText rate3 = (EditText) findViewById(R.id.ex_rate3);
        rate3.setText(""+ex_rate3);

        Button button2=(Button)findViewById(R.id.save);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float new_rate1 = Float.valueOf(rate1.getText().toString());
                float new_rate2 = Float.valueOf(rate2.getText().toString());
                float new_rate3 = Float.valueOf(rate3.getText().toString());

                Intent intent1 = getIntent();//构造Intent，用于传递数据
                Bundle bdl = new Bundle();
                bdl.putFloat("new_rate1",new_rate1);
                bdl.putFloat("new_rate2",new_rate2);
                bdl.putFloat("new_rate3",new_rate3);
                intent1.putExtras(bdl);
                setResult(RESULT_OK,intent1);//专门向上一个活动传递数据的
                finish();
            }
        });
    }
}
