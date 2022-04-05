package com.example.suma;
import com.example.suma.BasicOperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    BasicOperations basicOperations = new BasicOperations();

    private EditText number1, number2;
    private TextView result;
    private Button btnRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editTextNum1);
        number2 = findViewById(R.id.editTextNum2);
        btnRun = findViewById(R.id.buttonRun);
        result = findViewById(R.id.textViewResult);

        btnRun.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Double num1 = Double.parseDouble(number1.getText().toString());
                Double num2 = Double.parseDouble(number2.getText().toString());
                result.setText(String.valueOf(basicOperations.sum(num1, num2)));
            }
        });

    }
}