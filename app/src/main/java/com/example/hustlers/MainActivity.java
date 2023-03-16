package com.example.hustlers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ImageButton face_register;
    ImageButton face_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        face_register = (ImageButton) findViewById(R.id.face_register_btn);
        face_login = (ImageButton) findViewById(R.id.face_login_btn);

        face_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegisterFaceActivity.class);
                startActivity(intent);
            }
        });

        face_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FaceLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}