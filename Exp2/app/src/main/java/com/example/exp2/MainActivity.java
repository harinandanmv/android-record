package com.example.exp2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText subject1, subject2, subject3;
    Button calculateBtn;
    TextView sumView, avgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subject1 = findViewById(R.id.editTextSubject1);
        subject2 = findViewById(R.id.editTextSubject2);
        subject3 = findViewById(R.id.editTextSubject3);
        calculateBtn = findViewById(R.id.buttonCalculate);
        sumView = findViewById(R.id.textViewSum);
        avgView = findViewById(R.id.textViewAverage);

        calculateBtn.setOnClickListener(v -> {
            try {
                int mark1 = Integer.parseInt(subject1.getText().toString());
                int mark2 = Integer.parseInt(subject2.getText().toString());
                int mark3 = Integer.parseInt(subject3.getText().toString());

                int sum = mark1 + mark2 + mark3;
                float avg = sum / 3f;

                sumView.setText("Sum: " + sum);
                avgView.setText("Average: " + avg);
            } catch (NumberFormatException e) {
                Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
