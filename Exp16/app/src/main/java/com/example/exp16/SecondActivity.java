package com.example.exp16;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        txtResult = findViewById(R.id.txtResult);

        int sum = getIntent().getIntExtra("SUM_RESULT", 0);

        txtResult.setText("Sum = " + sum);
    }
}
