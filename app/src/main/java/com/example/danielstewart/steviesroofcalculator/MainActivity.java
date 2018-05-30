package com.example.danielstewart.steviesroofcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    private EditText d;
    private EditText b;
    private EditText c;
    private TextView a;
    private Button reset;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d = findViewById(R.id.d);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        a = findViewById(R.id.a);
        reset = findViewById(R.id.resetButton);
        calculate = findViewById(R.id.calculateButton);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    public void calculate(){
        String dStr = this.d.getText().toString();
        String bStr = this.b.getText().toString();
        String cStr = this.c.getText().toString();

        // Make sure user has entered b and at least
        if(bStr.isEmpty()){
            Toast.makeText(this, "Need to enter horizontal side length",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        if(dStr.isEmpty() && cStr.isEmpty()){
            Toast.makeText(this, "Need enter either angle or vertical side length",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        double b;
        double c;
        double d;

        Log.d(getClass().toString(), "C: " + cStr + " D: " + dStr + " B: " + bStr);

        try {
            b = Double.parseDouble(bStr);
            if(cStr.isEmpty()){
                c = -1;
                d = Double.parseDouble(dStr);
            } else {
                c = Double.parseDouble(cStr);
                d = -1;
            }
        } catch (NumberFormatException e){
            Toast.makeText(this, "Error parsing input",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        Triangle triangle = new Triangle(b, c, d);

        a.setText(String.format("%.2f",triangle.getA()));
        if(c == -1){
            this.c.setText(String.format("%.2f",triangle.getC()));
        } else {
            this.d.setText(String.format("%.2f", triangle.getD()));
        }

        a.setVisibility(View.VISIBLE);

    }

    public void reset(){
        a.setVisibility(View.INVISIBLE);
        d.setText("");
        b.setText("");
        c.setText("");
    }




}
