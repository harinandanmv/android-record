package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1Edit, num2Edit;
    Button addBtn, subBtn, mulBtn, divBtn;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1Edit = findViewById(R.id.editTextNumber1);
        num2Edit = findViewById(R.id.editTextNumber2);
        addBtn = findViewById(R.id.buttonAdd);
        subBtn = findViewById(R.id.buttonSub);
        mulBtn = findViewById(R.id.buttonMul);
        divBtn = findViewById(R.id.buttonDiv);
        resultView = findViewById(R.id.textViewResult);

        View.OnClickListener listener = v -> {
            String s1 = num1Edit.getText().toString();
            String s2 = num2Edit.getText().toString();

            if (s1.isEmpty() || s2.isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show();
                return;
            }

            double num1 = Double.parseDouble(s1);
            double num2 = Double.parseDouble(s2);
            double result = 0;

            int id = v.getId();
            if (id == R.id.buttonAdd) {
                result = num1 + num2;
            } else if (id == R.id.buttonSub) {
                result = num1 - num2;
            } else if (id == R.id.buttonMul) {
                result = num1 * num2;
            } else if (id == R.id.buttonDiv) {
                if (num2 == 0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = num1 / num2;
            }

            resultView.setText("Result: " + result);
        };

        addBtn.setOnClickListener(listener);
        subBtn.setOnClickListener(listener);
        mulBtn.setOnClickListener(listener);
        divBtn.setOnClickListener(listener);
    }
}
