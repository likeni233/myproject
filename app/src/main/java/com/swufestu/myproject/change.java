package com.swufestu.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class change extends AppCompatActivity {
    double change1 = 0;
    double change2 = 0;
    double change3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        Intent intent = getIntent();
        change1 = intent.getDoubleExtra("change1", 12.3);
        change2 = intent.getDoubleExtra("change2", 12.3);
        change3 = intent.getDoubleExtra("change3", 12.3);
        EditText text1 = findViewById(R.id.editTextNumberDecimal2);
        text1.setText("before:"+change1);
        EditText text2 = findViewById(R.id.editTextNumberDecimal3);
        text2.setText("before:"+change2);
        EditText text3 = findViewById(R.id.editTextNumberDecimal4);
        text3.setText("before:"+change3);
    }
    public void onclick(View view)
    {
//        Intent intent = new Intent(this, MainActivity.class);
        Intent intent = getIntent();
        EditText text1 = findViewById(R.id.editTextNumberDecimal2);
        EditText text2 = findViewById(R.id.editTextNumberDecimal3);
        EditText text3 = findViewById(R.id.editTextNumberDecimal4);
        double changed1 = Double.parseDouble(text1.getText().toString());
        double changed2 = Double.parseDouble(text2.getText().toString());
        double changed3 = Double.parseDouble(text3.getText().toString());
        intent.putExtra("changed1", changed1);
        intent.putExtra("changed2", changed2);
        intent.putExtra("changed3", changed3);
        setResult(3, intent);
        finish();
    }
    }
