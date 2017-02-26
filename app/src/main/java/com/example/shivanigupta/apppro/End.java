package com.example.shivanigupta.apppro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class End extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);


        b1 = (Button)findViewById(R.id.fb);
        b2 = (Button)findViewById(R.id.tw);
        b3 = (Button)findViewById(R.id.net);
        b4 = (Button)findViewById(R.id.hm);
        t1 = (TextView)findViewById(R.id.textView18);

        t1.setText("Your Score Is"+Ques1.score+"");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(End.this, facebook.class);
                startActivity(f);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(End.this, twitter.class);
                startActivity(t);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(End.this, netcamp.class);
                startActivity(n);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(End.this, Welcome.class);
                startActivity(h);
            }
        });

    }
}













