package com.mad.com.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String KEY = "Multiplication";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber=findViewById(R.id.editText4);
        final EditText secondNumber=findViewById(R.id.editText5);

        Button buttonMul =findViewById(R.id.button);

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number1 = Integer.parseInt(firstNumber.getText().toString());
                int number2 = Integer.parseInt(secondNumber.getText().toString());

                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra(KEY,number1+" X "+number2+" = "+(number1*number2));
                startActivity(intent);
            }
        })  ;


        Button buttonClear =findViewById(R.id.button2);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstNumber.setText("");
                secondNumber.setText("");

            }
        })  ;


    }
}
