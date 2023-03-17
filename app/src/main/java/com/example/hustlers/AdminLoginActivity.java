package com.example.hustlers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hustlers.admin.AdminDashboard;

public class AdminLoginActivity extends AppCompatActivity {


    EditText name;
    EditText password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        name = (EditText) findViewById(R.id.editTextTPersonName2);
        password = (EditText) findViewById(R.id.editTextTPersonName4);
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCorrect()) {
                    Intent intent = new Intent(AdminLoginActivity.this, AdminDashboard.class);
                    startActivity(intent);
                }
            }
        });
    }
    private boolean isCorrect() {
        return name.getText().toString().equals("admin") && password.getText().toString().equals("admin");
    }
}