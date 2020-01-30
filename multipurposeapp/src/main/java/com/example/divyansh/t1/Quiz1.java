package com.example.divyansh.t1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz1 extends AppCompatActivity {
    Button b1;
    static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        b1=(Button)findViewById(R.id.nqb1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Quiz1.this,Quiz2.class);
                startActivity(i);
                finish();
            }
        });
    }
}
