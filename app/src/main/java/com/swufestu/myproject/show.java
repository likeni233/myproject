package com.swufestu.myproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class show extends AppCompatActivity {
    double money = 0;
    double change1 = 0.15;
    double change2 = 6.8;
    double change3 = 7.5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 1 && resultCode == 3)
        {
            change1 = data.getDoubleExtra("changed1", 0.15);
            change2 = data.getDoubleExtra("changed2", 6.8);
            change3 = data.getDoubleExtra("changed3", 7.5);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void onCLickB(View view)
    {
        EditText text = findViewById(R.id.editTextNumberDecimal);
        money = Double.parseDouble(text.getText().toString());
        if(view.getId() == R.id.button)
        {
            money = money * change1;
        }
        else if(view.getId() == R.id.button2)
        {
            money = money * change2;
        }
        else if(view.getId() == R.id.button3)
        {
            money = money * change3;
        }
        TextView views = findViewById(R.id.textView2);
        views.setText("changed:"+String.format("%.2f",money));
    }

    public  void onClickC(View view)
    {
        Intent intent = new Intent(this,change.class);
        intent.putExtra("change1", change1);
        intent.putExtra("change2", change2);
        intent.putExtra("change3", change3);
//        startActivity(intent);
        startActivityForResult(intent, 1);
    }
}