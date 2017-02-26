package com.example.shivanigupta.apppro;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button)findViewById(R.id.login);
        b2 = (Button)findViewById(R.id.signup);

        e1 = (EditText)findViewById(R.id.username);
        e2 = (EditText)findViewById(R.id.password);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = e1.getText().toString();
                String pass = e2.getText().toString();

                if(user.equals("") || pass.equals(""))
                {
                    Toast.makeText(Login.this,"Please Fill All The Fields",Toast.LENGTH_SHORT).show();
                }


                if(!(user.equals("")) && !(user.equals("")))
                {
                    SQLiteDatabase data = openOrCreateDatabase("apppro",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists details (name varchar, password varchar)");
                    String s3 = "select * from details where name='"+user+"' and password='"+pass+"'";
                    Cursor cursor = data.rawQuery(s3,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Login.this,"DONE",Toast.LENGTH_SHORT).show();
                        Intent k = new Intent(Login.this,Welcome.class);
                        startActivity(k);
                    }

                    else
                    {
                        Toast.makeText(Login.this,"SORRY!! Details Mismatch",Toast.LENGTH_SHORT).show();
                    }
                }



            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,SignUp.class);
                startActivity(i);
            }
        });
    }
}















