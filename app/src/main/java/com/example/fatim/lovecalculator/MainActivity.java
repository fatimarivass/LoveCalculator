package com.example.fatim.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText tu, yo;
    TextView tv;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showResult(View v){
        tu=(EditText) findViewById(R.id.editText);
        yo=(EditText) findViewById(R.id.editText2);
        tv=(TextView) findViewById(R.id.textView);
        String y=yo.getText().toString();
        String t=tu.getText().toString();
        String sum = y+t;
        sum=sum.toLowerCase();
        int value=sum.hashCode();


        Random random= new Random(value);
        result=(random.nextInt(100)+1)+"%";



        tv.setText(result);


    }

}
