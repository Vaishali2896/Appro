package com.example.shivanigupta.apppro;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Magic extends AppCompatActivity implements SensorEventListener {

    Button b;
    SensorManager sm;
    Sensor s;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic);

        b = (Button)findViewById(R.id.button15);
        mp = MediaPlayer.create(this,R.raw.a);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Magic.this,Welcome.class);
                startActivity(k);
            }
        });


    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.values[0]>0 || sensorEvent.values[1]>0 || sensorEvent.values[2]>0)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }



    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
