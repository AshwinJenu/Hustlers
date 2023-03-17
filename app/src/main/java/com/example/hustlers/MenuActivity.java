package com.example.hustlers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView name_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String name = getIntent().getStringExtra("name");
        name_tv = (TextView) findViewById(R.id.name_tv);
        name_tv.setText(name);

    }
}