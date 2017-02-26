package com.example.shivanigupta.apppro;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Locale;

public class Ques2 extends AppCompatActivity {

    RadioButton r1,r2,r3,r4;
    Button b1;
    TextToSpeech ts1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);

        r1 = (RadioButton)findViewById(R.id.radioButton5);
        r2 = (RadioButton)findViewById(R.id.radioButton6);
        r3 = (RadioButton)findViewById(R.id.radioButton7);
        r4 = (RadioButton)findViewById(R.id.radioButton8);
        b1 = (Button)findViewById(R.id.nx2);

        ts1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts1.setLanguage(Locale.ENGLISH);
                ts1.setSpeechRate(0.3f);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r1.isChecked())
                {
                    (Ques1.score)++;
                    ts1.speak("Correct Answer",TextToSpeech.QUEUE_FLUSH,null);
                }
                else
                {
                    (Ques1.score)--;
                    ts1.speak("Wrong Answer",TextToSpeech.QUEUE_FLUSH,null);
                }

                Toast.makeText(Ques2.this,"Current Score is"+Ques1.score,Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Ques2.this, Ques3.class);
                startActivity(i);

            }
        });
    }
}
