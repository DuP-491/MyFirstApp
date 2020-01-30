package com.example.divyansh.t1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bs,bm,bd,be,br,bc;
    TextView t1;
    static int ans[]={0,0,0,0,0};
    static int sign=0;
    static int i=0;
    static int result=0;
    String k="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        t1=(TextView)findViewById(R.id.tq1);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        bp=(Button)findViewById(R.id.add);
        bs=(Button)findViewById(R.id.sub);
        bm=(Button)findViewById(R.id.mul);
        bd=(Button)findViewById(R.id.div);
        be=(Button)findViewById(R.id.equals);
        br=(Button)findViewById(R.id.res);
        bc=(Button)findViewById(R.id.regi1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"1";
                t1.setText(k);
                ans[i]=ans[i]*10+1;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"2";
                t1.setText(k);
                ans[i]=ans[i]*10+2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"3";
                t1.setText(k);
                ans[i]=ans[i]*10+3;
            }
        });b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"4";
                t1.setText(k);
                ans[i]=ans[i]*10+4;
            }
        });b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"5";
                t1.setText(k);
                ans[i]=ans[i]*10+5;
            }
        });b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"6";
                t1.setText(k);
                ans[i]=ans[i]*10+6;
            }
        });b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"7";
                t1.setText(k);
                ans[i]=ans[i]*10+7;
            }
        });b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"8";
                t1.setText(k);
                ans[i]=ans[i]*10+8;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"9";
                t1.setText(k);
                ans[i]=ans[i]*10+9;
            }
        });b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"0";
                t1.setText(k);
                ans[i]=ans[i]*10+0;
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"+";
                t1.setText(k);
                i++;
                if(sign==0)
                {
                    result=result+ans[i-1];
                }
                if(sign==1)
                {
                    result=result-ans[i-1];
                }
                if(sign==2)
                {
                    result=result*ans[i-1];
                }
                if(sign==3)
                {
                    result=result/ans[i-1];
                }

                sign=0;

            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k=k+"-";
                t1.setText(k);
                i++;
                if(sign==0)
                {
                    result=result+ans[i-1];
                }
                if(sign==1)
                {
                    result=result-ans[i-1];
                }
                if(sign==2)
                {
                    result=result*ans[i-1];
                }
                if(sign==3)
                {
                    result=result/ans[i-1];
                }

                sign=1;

            }
        });


        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                k=k+"*";
                t1.setText(k);
                i++;
                if(sign==0)
                {
                    result=result+ans[i-1];
                }
                if(sign==1)
                {
                    result=result-ans[i-1];
                }
                if(sign==2)
                {
                    result=result*ans[i-1];
                }
                if(sign==3)
                {
                    result=result/ans[i-1];
                }

                sign=2;
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k=k+"/";
                t1.setText(k);
                i++;
                if(sign==0)
                {
                    result=result+ans[i-1];
                }
                if(sign==1)
                {
                    result=result-ans[i-1];
                }
                if(sign==2)
                {
                    result=result*ans[i-1];
                }
                if(sign==3)
                {
                    result=result/ans[i-1];
                }

                sign=3;
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                i++;
                if(sign==0)
                {
                    result=result+ans[i-1];
                }
                if(sign==1)
                {
                    result=result-ans[i-1];
                }
                if(sign==2)
                {
                    result=result*ans[i-1];
                }
                if(sign==3)
                {
                    result=result/ans[i-1];
                }
                String sh;
                t1.setText("");
                sh=Integer.toString(result);
                t1.setText(sh);
                ans[0]=0;
                ans[1]=0;
                ans[2]=0;
                ans[3]=0;
                ans[4]=0;
                k="";
                i=0;
                result=0;
                sign=0;

            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                ans[0]=0;
                ans[1]=0;
                ans[2]=0;
                ans[3]=0;
                ans[4]=0;
                k="";
                t1.setText("");
                i=0;
                result=0;
                sign=0;

            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans[0]=0;
                ans[1]=0;
                ans[2]=0;
                ans[3]=0;
                ans[4]=0;
                k="";
                t1.setText("");
                i=0;
                result=0;
                sign=0;
                Intent i=new Intent(Calculator.this,Op1.class);
                startActivity(i);
                finish();
            }
        });

    }
}
