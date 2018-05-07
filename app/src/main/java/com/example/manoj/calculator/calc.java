package com.example.manoj.calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.graphics.Color.BLACK;

public class calc extends AppCompatActivity{
    private EditText editText;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, dot, equal, power, root, sin, cos, tan, log, sum, diff, mult, div, mod, back, clear, fact;

    char c = 'a';
    boolean b = false;
    float y, g,r;
    int h, p;
    String a=" ",s,x[],z[];
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        editText = (EditText) findViewById(R.id.editText);
        one = (Button) findViewById(R.id.Button5);
        two = (Button) findViewById(R.id.Button6);
        three = (Button) findViewById(R.id.Button7);
        four = (Button) findViewById(R.id.Button9);
        six = (Button) findViewById(R.id.Button10);
        five = (Button) findViewById(R.id.Button11);
        seven = (Button) findViewById(R.id.Button13);
        eight = (Button) findViewById(R.id.Button14);
        nine = (Button) findViewById(R.id.Button15);
        zero = (Button) findViewById(R.id.Button2);
        dot = (Button) findViewById(R.id.Button);
        sum = (Button) findViewById(R.id.Button16);
        diff = (Button) findViewById(R.id.Button12);
        mult = (Button) findViewById(R.id.Button8);
        div = (Button) findViewById(R.id.Button4);
        mod = (Button) findViewById(R.id.Button3);
        equal = (Button) findViewById(R.id.Button25);
        root = (Button) findViewById(R.id.Button21);
        power = (Button) findViewById(R.id.Button17);
        sin = (Button) findViewById(R.id.Button18);
        cos = (Button) findViewById(R.id.Button19);
        tan = (Button) findViewById(R.id.Button20);
        log = (Button) findViewById(R.id.Button22);
        fact = (Button) findViewById(R.id.Button23);
        back = (Button) findViewById(R.id.Button24);
        clear = (Button) findViewById(R.id.Button26);


        sum.setClickable(false);
        diff.setClickable(false);
        mult.setClickable(false);
        div.setClickable(false);
        mod.setClickable(false);
        equal.setClickable(false);
        back.setClickable(false);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "1";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText() + "2";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "3";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText() + "4";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=editText.getText() + "6";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "5";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText() + "7";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText() + "8";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText() + "9";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText() + "0";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                back.setClickable(true);
                i=1;
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText().toString();
                char t[]=a.toCharArray();
                if(t.length==0)
                    a=a+"0.";
                else {
                    if (t[t.length - 1] == '1' || t[t.length - 1] == '2' || t[t.length - 1] == '3' || t[t.length - 1] == '4' || t[t.length - 1] == '5' || t[t.length - 1] == '6' || t[t.length - 1] == '7' || t[t.length - 1] == '9' || t[t.length - 1] == '0' || t[t.length - 1] == '8') {
                        a = a + ".";
                    } else if(t[t.length - 1] == '*' || t[t.length - 1] == '+' || t[t.length - 1] == '-' || t[t.length - 1] == '/' || t[t.length - 1] == '%'){
                        a = a + "0.";
                    }
                }
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                dot.setClickable(false);
                back.setClickable(true);
                i=1;
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "\n+";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(false);
                diff.setClickable(false);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(true);
                dot.setClickable(true);
                c='+';
                i=1;

            }
        });
        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "\n-";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(false);
                diff.setClickable(false);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(true);
                dot.setClickable(true);
                i=1;
                c='-';
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "\n*";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(false);
                diff.setClickable(false);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(true);
                dot.setClickable(true);
                c='*';
                i=1;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "\n/";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(false);
                diff.setClickable(false);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(true);
                dot.setClickable(true);
                c='/';
                i=1;
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "\n%";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(false);
                diff.setClickable(false);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(true);
                dot.setClickable(true);
                c='%';
                i=1;
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = a.split("[%*+/=-]");
                y=Float.parseFloat(x[x.length-1]);
                if(Math.ceil(Math.sqrt(y))==Math.floor(Math.sqrt(y))) {
                    h = (int) Math.sqrt(y);
                    a = editText.getText() + "\n=" + h;
                }
                else
                    a = editText.getText() + "\n=" + Math.sqrt(y);
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(true);
                diff.setClickable(true);
                mult.setClickable(true);
                div.setClickable(true);
                mod.setClickable(true);
                equal.setClickable(false);
                dot.setClickable(false);
                c='r';
                i=1;
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText() + "^";
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(false);
                diff.setClickable(true);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(true);
                dot.setClickable(false);
                i=1;
                c='p';
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= editText.getText()+"sin".toString();
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                sum.setClickable(false);
                diff.setClickable(true);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(true);
                dot.setClickable(false);
                i=1;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                a="";
                c='a';
                sum.setClickable(false);
                diff.setClickable(false);
                mult.setClickable(false);
                div.setClickable(false);
                mod.setClickable(false);
                equal.setClickable(false);
                dot.setClickable(true);
                back.setClickable(false);
                i=1;

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = editText.getText().toString();
                char[] t=a.toCharArray();

                if(t.length>1) {
                    t[t.length - i] = '\0';
                    a = String.valueOf(t);
                }
                if(t.length==1 || t.length==0)
                    back.setClickable(false);
                editText.setText(a);
                editText.setSelection(editText.getText().length());
                if(t[t.length-1]=='+'|| t[t.length-2]=='-'|| t[t.length-2]=='*' || t[t.length-2]=='/'||t[t.length-2]=='%'||t[t.length-2]=='=') {
                    sum.setClickable(false);
                    diff.setClickable(false);
                    mult.setClickable(false);
                    div.setClickable(false);
                    mod.setClickable(false);
                }
                else {


                    sum.setClickable(true);
                    diff.setClickable(true);
                    mult.setClickable(true);
                    div.setClickable(true);
                    mod.setClickable(true);
                    equal.setClickable(true);
                    i++;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.replaceAll("\n","");
                x=a.split("[=%*+/-]");
                g = Float.parseFloat(x[x.length - 2]);
                y = Float.parseFloat(x[x.length - 1]);
                if(y==0){
                        editText.setText("please clear the screen and Enter a number to divide which is not Zero");
                    equal.setClickable(false);

                }
                else {
                    if (c == '+')
                        callp();
                    if (c == '-')
                        calls();
                    if (c == '*')
                        callm();
                    if (c == '/')
                        calld();
                    if (c == '%')
                        callmo();
                    sum.setClickable(true);
                    diff.setClickable(true);
                    mult.setClickable(true);
                    div.setClickable(true);
                    mod.setClickable(true);
                    equal.setClickable(false);
                    dot.setClickable(true);
                    i = 1;
                }

            }
        });

        equal.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                equal.setBackgroundColor(Color.BLACK);
                return true;
            }
        });

    }

    public void callp() {
        if(Math.ceil(g)==Math.floor(g) && Math.ceil(y)==Math.floor(y)){
            h=(int)g;
            p=(int)y;
            System.out.println("yes");
            a = a + "\n=" + String.valueOf(h + p);
        }
        else {
            a = a + "\n=" + String.valueOf(g + y);
        }
        editText.setText(a);
        editText.setSelection(editText.getText().length());
        c='a';

    }
    public void calls() {
        if(Math.ceil(g)==Math.floor(g) && Math.ceil(y)==Math.floor(y)){
            h=(int)g;
            p=(int)y;
            a = a + "\n=" + String.valueOf(h - p);
        }
        else {
            a = a + "\n=" + String.valueOf(g - y);
        }
        editText.setText(a);
        editText.setSelection(editText.getText().length());
        c='a';
    }
    public void callm() {
        if(Math.ceil(g)==Math.floor(g) && Math.ceil(y)==Math.floor(y)){
            h=(int)g;
            p=(int)y;
            a = a + "\n=" + String.valueOf(h * p);
        }
        else {
            a = a + "\n=" + String.valueOf(g * y);
        }
        editText.setText(a);
        editText.setSelection(editText.getText().length());
        c='a';
    }
    public void calld() {
        r= g/y;
        if(Math.ceil(r)==Math.floor(r)){
            h=(int)r;
            a = a + "\n=" + String.valueOf(h);
        }
        else {
            a = a + "\n=" + String.valueOf(g / y);
        }
        editText.setText(a);
        c='a';
        editText.setSelection(editText.getText().length());

    }
    public void callmo() {
        if(Math.ceil(g)==Math.floor(g) && Math.ceil(y)==Math.floor(y)){
            h=(int)g;
            p=(int)y;
            a = a + "\n=" + String.valueOf(h % p);
        }
        else {
            a = a + "\n=" + String.valueOf(g % y);
        }
        editText.setText(a);
        editText.setSelection(editText.getText().length());
        c='a';
    }
}
