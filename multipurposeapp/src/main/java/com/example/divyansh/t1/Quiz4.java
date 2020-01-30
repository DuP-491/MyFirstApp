package com.example.divyansh.t1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz4 extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        b1=(Button)findViewById(R.id.qb4);
        t1=(TextView)findViewById(R.id.tq4);
        r1=(RadioButton)findViewById(R.id.radioButton13);
        r2=(RadioButton)findViewById(R.id.radioButton14);
        r3=(RadioButton)findViewById(R.id.radioButton15);
        r4=(RadioButton)findViewById(R.id.radioButton16);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked()){
                    ++Quiz1.score;
                }
                else {
                    --Quiz1.score;
                }
                Intent i=new Intent(Quiz4.this,Quiz5.class);
                startActivity(i);
                finish();
            }
        });
    }
}
