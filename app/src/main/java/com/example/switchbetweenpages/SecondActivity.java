package com.example.switchbetweenpages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // capture info from home page
        if (getIntent().hasExtra( "com.example.switchbetweenpages.something")){
            TextView tv = (TextView) findViewById((R.id.textView));
            String text = getIntent().getExtras().getString("com.example.switchbetweenpages.something");
            tv.setText(text);
        }
    }
}