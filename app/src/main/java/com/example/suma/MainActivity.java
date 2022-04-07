package com.example.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    //Para luego ocultar el teclado

    BasicOperations basicOperations = new BasicOperations();

    private EditText number1, number2;
    private TextView result;
    private Button btnSum, btnSub, btnMul, btnDiv;


    //Método que verifica si los campos están vacíos
    private boolean emptyInput(){
        boolean empty = false;

        if(number1.getText().toString().trim().equals("")){
            number1.setError(getResources().getString(R.string.empty_input));
            empty = true;
        }else if(number2.getText().toString().trim().equals("")){
            number2.setError(getResources().getString(R.string.empty_input));
            empty = true;
        }

        return empty;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editTextNum1);
        number2 = findViewById(R.id.editTextNum2);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        result = findViewById(R.id.textViewResult);


        //Método para sumar
        btnSum.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                try{
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(btnSum.getWindowToken(), 0);
                    if(!emptyInput()){
                        Double num1 = Double.parseDouble(number1.getText().toString());
                        Double num2 = Double.parseDouble(number2.getText().toString());

                        result.setText(basicOperations.sum(num1, num2));
                        number1.setText("");
                        number2.setText("");
                    }
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.err_data), Toast.LENGTH_LONG);
                }
            }
        });


        //Método para restar
        btnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                try{
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(btnSub.getWindowToken(), 0);
                    if(!emptyInput()){
                        Double num1 = Double.parseDouble(number1.getText().toString());
                        Double num2 = Double.parseDouble(number2.getText().toString());

                        result.setText(basicOperations.subtraction(num1, num2));
                        number1.setText("");
                        number2.setText("");
                    }
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.err_data), Toast.LENGTH_LONG);
                }
            }
        });


        //Método para multiplicar
        btnMul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                try{
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(btnMul.getWindowToken(), 0);
                    if(!emptyInput()){
                        Double num1 = Double.parseDouble(number1.getText().toString());
                        Double num2 = Double.parseDouble(number2.getText().toString());

                        result.setText(basicOperations.multiplication(num1, num2));
                        number1.setText("");
                        number2.setText("");
                    }
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.err_data), Toast.LENGTH_LONG);
                }
            }
        });


        //Método para dividir
        btnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                try{
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(btnDiv.getWindowToken(), 0);
                    if(!emptyInput()){
                        Double num1 = Double.parseDouble(number1.getText().toString());
                        Double num2 = Double.parseDouble(number2.getText().toString());

                        if(num2 == 0){
                            number2.setError(getResources().getString(R.string.err_div0));
                        }else {
                            result.setText(basicOperations.division(num1, num2));
                            number1.setText("");
                            number2.setText("");
                        }
                    }
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.err_data), Toast.LENGTH_LONG);
                }
            }
        });
    }
}