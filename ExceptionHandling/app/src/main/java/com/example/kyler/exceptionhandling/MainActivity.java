package com.example.kyler.exceptionhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtFirst,edtSecond;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtFirst =(EditText) findViewById(R.id.edt_first);
        edtSecond =(EditText) findViewById(R.id.edt_second);
        txtResult =(TextView) findViewById(R.id.txt_result);
        StringBuilder builder = new StringBuilder();
        String abc = "abc";
        String bcd = "bcd";
        builder.append(abc);
        builder.append(bcd);
        String rs = abc+bcd;
        String result = builder.toString();
    }

    public void onClick(View view){
        try {
            int first = Integer.parseInt(edtFirst.getText().toString().trim());
            int second = Integer.parseInt(edtSecond.getText().toString().trim());
            float result = first / second;
            txtResult.setText("Result is "+ result);
        }catch (ArithmeticException ae){
            txtResult.setText("Cann't divide by zero");
        }catch (NumberFormatException ne){
            txtResult.setText("Input must be a number");
        }
        Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
    }
}
