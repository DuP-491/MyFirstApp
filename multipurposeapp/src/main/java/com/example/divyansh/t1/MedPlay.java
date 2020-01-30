package com.example.divyansh.t1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MedPlay extends AppCompatActivity {
    Button b1,b2,b3;
    TextView t1;
    MediaPlayer m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_play);
        b2=(Button)findViewById(R.id.play);
        b3=(Button)findViewById(R.id.stop);
        b1=(Button)findViewById(R.id.qb5);
        t1=(TextView)findViewById(R.id.tq3);
        m= MediaPlayer.create(this,R.raw.star);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.stop();
                Intent i=new Intent(MedPlay.this,Op1.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.start();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.pause();
            }
        });
    }
}
