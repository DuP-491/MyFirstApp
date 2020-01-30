package com.example.divyansh.t1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Regis extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2,e3,e4,e5;
    boolean isValidEmail(String s)
    {
        int c=0,i,pa=0,pd=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                c++;
                pd=i;
            }
            if(s.charAt(i)=='@')
            {
                c++;
                pa=i;
            }
        }
        if(c==2&&(pa-pd)>1)
            return true;
        else
            return false;
    }
    boolean isNum(String s)
    {
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)<48||s.charAt(i)>57)
            {
                return false;
            }
        }
        if(s.charAt(0)=='0'||s.length()!=10)
            return false;
        else
            return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        b1=(Button)findViewById(R.id.bk2);
        b2=(Button)findViewById(R.id.su);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        e3=(EditText)findViewById(R.id.editText5);
        e4=(EditText)findViewById(R.id.editText6);
        e5=(EditText)findViewById(R.id.editText7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Regis.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String s1,s2,s3,s4,s5;
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();


                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals(""))
                {
                    Toast.makeText(Regis.this, "FILL ALL FIELDS", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    SQLiteDatabase data = openOrCreateDatabase("user", MODE_PRIVATE, null);
                    data.execSQL("create table if not exists pals(name varchar,password varchar,email varchar,city varchar,number varchar)");
                    String s6 = "select * from pals where name='" + s1 + "' and password='" + s2 + "'";
                    Cursor cus = data.rawQuery(s6, null);
                    if(isValidEmail(s3))
                    {
                    if (cus.getCount() > 0) {
                        Toast.makeText(Regis.this, "USERS EXISTS", Toast.LENGTH_SHORT).show();
                    } else {
                        data.execSQL("insert into pals values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "')");
                        Toast.makeText(Regis.this, "REGISTERED SUCCESSFULLY", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Regis.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                    }
                    else
                    {
                        Toast.makeText(Regis.this, "INVALID EMAIL OR PASSWORD", Toast.LENGTH_SHORT).show();
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                    }

                }
            }
        });

    }
}
