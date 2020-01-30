package com.example.divyansh.t1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4;
    static String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1=(TextView)findViewById(R.id.textView6);
        b1=(Button)findViewById(R.id.facebook);
        b2=(Button)findViewById(R.id.twitter);
        b3=(Button)findViewById(R.id.netcamp);
        b4=(Button)findViewById(R.id.retest);
        t1.setText("THE RESULT IS "+Quiz1.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="https://facebook.com";
                Intent i=new Intent(Result.this,Web.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="https://twitter.com";
                Intent i=new Intent(Result.this,Web.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="https://www.netcamp.in";
                Intent i=new Intent(Result.this,Web.class);
                startActivity(i);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Result.this,Quiz1.class);
                startActivity(i);
                finish();
            }
        });

    }
}
