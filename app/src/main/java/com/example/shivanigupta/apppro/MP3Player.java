package com.example.shivanigupta.apppro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MP3Player extends AppCompatActivity {

    Button b1,b2,b3;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3_player);

        b1 = (Button)findViewById(R.id.play);
        b2 = (Button)findViewById(R.id.pause);
        b3 = (Button)findViewById(R.id.bk);
        mp = MediaPlayer.create(this,R.raw.a);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MP3Player.this,Welcome.class);
                startActivity(b);
            }
        });
    }
}
