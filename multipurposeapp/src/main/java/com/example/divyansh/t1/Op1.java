package com.example.divyansh.t1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Op1 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op1);
        b1=(Button)findViewById(R.id.bk2);
        b2=(Button)findViewById(R.id.mp);
        b3=(Button)findViewById(R.id.cal);
        b4=(Button)findViewById(R.id.cam);
        b5=(Button)findViewById(R.id.op);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Op1.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Op1.this,MedPlay.class);
                startActivity(i);
                finish();

            }
        });
       b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Op1.this,Calculator.class);
                startActivity(i);
                finish();
            }
        });
       b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Op1.this,Camera.class);
                startActivity(i);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Op1.this,Op2.class);
                startActivity(i);
                finish();
            }
        });
    }
}
