package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button temp;
    EditText C;
    TextView F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (Button) findViewById(R.id.button);
        temp.setOnClickListener(this);
        C = (EditText) findViewById(R.id.editTextTextPersonName);
        F = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        double c = Double.parseDouble(C.getText().toString());
        double f = c*9/5+32;
        F.setText(""+f);
    }
}