package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    Button tamb, kur, kal, bag;

    float number1, number2, getResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        tamb = findViewById(R.id.tambah);
        kur = findViewById(R.id.kurang);
        kal = findViewById(R.id.kali);
        bag = findViewById(R.id.bagi);


        tamb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                getResult = number1 + number2;
                result.setText(String.valueOf(getResult));

            }
        });

        kur.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                getResult = number1 - number2;
                result.setText(String.valueOf(getResult));

            }
        });

        kal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                getResult = number1 * number2;
                result.setText(String.valueOf(getResult));

            }
        });

        bag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                getResult = number1 / number2;
                result.setText(String.valueOf(getResult));

            }
        });
    }
}