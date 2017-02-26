package com.example.shivanigupta.apppro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    Button bk, ad, sub, pr, q, res, reset;
    EditText e1,e2;
    TextView t1;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        bk = (Button)findViewById(R.id.button7);
        ad = (Button)findViewById(R.id.button8);
        sub = (Button)findViewById(R.id.button9);
        pr = (Button)findViewById(R.id.button10);
        q = (Button)findViewById(R.id.button11);
        res = (Button)findViewById(R.id.button12);
        reset = (Button)findViewById(R.id.button13);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView3);

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);

                Integer i3 = i1+i2;
                result = i3;
                String s3 = Integer.toString(i3);

                t1.setText(s3);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);

                Integer i3 = i1-i2;
                result = i3;
                String s3 = Integer.toString(i3);

                t1.setText(s3);
            }
        });

        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);

                Integer i3 = i1*i2;
                result = i3;
                String s3 = Integer.toString(i3);

                t1.setText(s3);
            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);

                if(i2==0)
                    t1.setText("MATH ERROR");

                else
                {
                    Integer i3 = i1/i2;
                    result = i3;
                    String s3 = Integer.toString(i3);
                    t1.setText(s3);
                }
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3 = Integer.toString(result);
                t1.setText(s3);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Calculator.this,Welcome.class);
                startActivity(i);
            }
        });
    }
}


















