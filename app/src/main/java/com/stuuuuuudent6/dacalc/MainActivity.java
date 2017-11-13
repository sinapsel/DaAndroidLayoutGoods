package com.stuuuuuudent6.dacalc;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View v){
        EditText num1 = (EditText) this.findViewById(R.id.num1);
        String num1Text = num1.getText().toString();
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String num2Text = num2.getText().toString();
        TextView res = (TextView) this.findViewById(R.id.out);
        res.setText(String.valueOf(Double.parseDouble(num1Text) + Double.parseDouble(num2Text)));

    }

    public void minus(View v) {
        EditText num1 = (EditText) this.findViewById(R.id.num1);
        String num1Text = num1.getText().toString();
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String num2Text = num2.getText().toString();
        TextView res = (TextView) this.findViewById(R.id.out);
        res.setText(String.valueOf(Double.parseDouble(num1Text) - Double.parseDouble(num2Text)));
    }
}
