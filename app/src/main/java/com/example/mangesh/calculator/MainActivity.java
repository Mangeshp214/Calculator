package com.example.mangesh.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,clr,equal;
    TextView v1,v2,sgn,answr;
    double val1,val2,ans;
    Calculate calculate;
    String sign;
    Boolean val_1 = false,opr = false,val_2 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initviews();
        final Calculate calculate = new Calculate();

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("0");
                }else {
                    v1.append("0");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("1");
                }else{
                    v1.append("1");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("2");
                }else{
                    v1.append("2");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("3");
                }else{
                    v1.append("3");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("4");
                }else{
                    v1.append("4");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("5");
                }else{
                    v1.append("5");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("6");
                }else{
                    v1.append("6");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("7");
                }else{
                    v1.append("7");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr){
                    v2.append("8");
                }else{
                    v1.append("8");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opr) {

                    v2.append("9");
                }else{
                    v1.append("9");
                }
                if(opr && val_2){
                    Toast.makeText(MainActivity.this,"First Clear the initial values !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        add.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(val_1 && opr){
                    val2 = Double.parseDouble(v2.getText().toString());

                    val_2 = calculate.setValue2(val2);
                    ans = calculate.calc(sgn.getText().toString());

                    answr.setText(Double.toString(ans));

                    v1.setText(Double.toString(ans));
                    val_1 = calculate.setValue(ans);

                    sgn.setText("+");

                    v2.setText("");
                    val_2 = false;
                    opr = true;
                }else if(val_1 == false){
                    val1 = Double.parseDouble(v1.getText().toString());

                    val_1 = calculate.setValue(val1);

                    sgn.setText("+");

                    opr = true;
                }else {
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_SHORT).show();
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val_1 && opr){
                    val2 = Double.parseDouble(v2.getText().toString());

                    val_2 = calculate.setValue2(val2);
                    ans = calculate.calc(sgn.getText().toString());

                    answr.setText(Double.toString(ans));

                    v1.setText(Double.toString(ans));
                    val_1 = calculate.setValue(ans);


                    sgn.setText("-");

                    v2.setText("");
                    val_2 = false;
                    opr = true;
                }else{
                    val1 = Double.parseDouble(v1.getText().toString());

                    val_1 = calculate.setValue(val1);
                    opr = true;
                    sgn.setText("-");

                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val_1 && opr){
                    val2 = Double.parseDouble(v2.getText().toString());

                    val_2 = calculate.setValue2(val2);
                    ans = calculate.calc(sgn.getText().toString());

                    answr.setText(Double.toString(ans));

                    v1.setText(Double.toString(ans));
                    val_1 = calculate.setValue(ans);

                    sgn.setText("*");

                    v2.setText("");
                    val_2 = false;
                    opr = true;
                }else{
                    val1 = Double.parseDouble(v1.getText().toString());

                    val_1 = calculate.setValue(val1);
                    opr = true;

                    sgn.setText("*");

                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val_1 && opr){
                    val2 = Double.parseDouble(v2.getText().toString());

                    val_2 = calculate.setValue2(val2);
                    ans = calculate.calc(sgn.getText().toString());

                    answr.setText(Double.toString(ans));

                    v1.setText(Double.toString(ans));
                    val_1 = calculate.setValue(ans);

                    sgn.setText("/");

                    v2.setText("");
                    val_2 = false;
                    opr = true;
                }else{
                    val1 = Double.parseDouble(v1.getText().toString());

                    val_1 = calculate.setValue(val1);
                    opr = true;

                    sgn.setText("/");

                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opr){
                    val2 = Double.parseDouble(v2.getText().toString());

                    val_2 = calculate.setValue2(val2);

                    sign = sgn.getText().toString();

                    ans = calculate.calc(sign);

                    answr.setText(Double.toString(ans));
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v1.setText("");
                v2.setText("");
                sgn.setText("");
                answr.setText("");
                opr = false;
                val_2 = false;
                val_1 = false;
            }
        });

    }

    void initviews(){
        b0 = (Button)findViewById(R.id.button0);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        equal = (Button)findViewById(R.id.equals);
        clr =(Button)findViewById(R.id.dot);
        v1 = (TextView) findViewById(R.id.val1);
        v2 = (TextView)findViewById(R.id.val2);
        answr = (TextView)findViewById(R.id.ans);
        sgn = (TextView)findViewById(R.id.sign);

    }


}
