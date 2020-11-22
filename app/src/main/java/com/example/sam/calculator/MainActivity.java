package com.example.sam.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context ctx = MainActivity.this;

        final EditText num = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);

        // inner class
        class Calc {
            private int num, res; // instance variable
            String op;

            /*public void exe() {
                switch(op) {
                    case "+": res = num + num2; break;
                    case "-": res = num - num2; break;
                    case "*": res = num * num2; break;
                    case "/": res = num / num2; break;

                }

            }*/

            public int getNum() {
                return this.num;

            }

            public void setNum(int num1) {
                this.num = num1;

            }

            public int getRes() {
                return this.res;

            }

            public void setRes(int res) {
                this.res = res;

            }

            public String getOp() {
                return this.op;

            }

            public void setOp(String op) {
                this.op = op;

            }

        } // class Calc ends

        final Calc calc = new Calc();

        findViewById(R.id.addBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());

                calc.setNum(a);
                calc.setOp("+");

//                calc.exe();

            }

        });

        findViewById(R.id.subBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());

                calc.setNum(a);
                calc.setOp("-");

//                calc.exe();

            }

        });

        findViewById(R.id.mulBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());

                calc.setNum(a);
                calc.setOp("*");

//                calc.exe();

            }

        });

        findViewById(R.id.divBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());

                calc.setNum(a);
                calc.setOp("/");

//                calc.exe();

            }

        });

        findViewById(R.id.equBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "Result: " + calc.getRes(), Toast.LENGTH_LONG).show();

                result.setText(calc.getRes());

            }

        });

    }

}
