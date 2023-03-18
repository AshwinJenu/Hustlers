package com.example.hustlers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hustlers.Admin.AdminDashboard;

import java.util.List;

public class TokenActivity extends AppCompatActivity {



    ListView listToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token_acticity);

        listToken = (ListView) findViewById(R.id.listToken);
        GetTokens getTokens = new GetTokens();
        List<String> list = getTokens.getList(getIntent().getStringExtra("uid"));

        ArrayAdapter arrayAdapter = new ArrayAdapter(TokenActivity.this, android.R.layout.simple_list_item_1, list);

        listToken.setAdapter(arrayAdapter);

    }
}