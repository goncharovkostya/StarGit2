package com.example.stargit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mainButton;
    TextView mainTextView;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Void comment
        a = 0;
        mainButton = findViewById(R.id.main_button);
        mainTextView = findViewById(R.id.answer);
        mainButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        mainTextView.setText("" + ++a);
    }
}
