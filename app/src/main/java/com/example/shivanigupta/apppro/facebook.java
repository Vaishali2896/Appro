package com.example.shivanigupta.apppro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class facebook extends AppCompatActivity {

    Button b1;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        b1 = (Button)findViewById(R.id.button18);
        w1 = (WebView)findViewById(R.id.webView);

        w1.loadUrl("http://www.facebook.com");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(facebook.this, End.class);
                startActivity(i);
            }
        });
    }
}
