package com.example.hustlers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hustlers.Admin.AdminDashboard;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class TokenActivity extends AppCompatActivity {


    FirebaseFirestore db = FirebaseFirestore.getInstance();
    ListView listToken;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token_acticity);

        listToken = (ListView) findViewById(R.id.listToken);
        GetTokens getTokens = new GetTokens();
        String uid = getIntent().getStringExtra("uid");


        CollectionReference appRef = db.collection("appointment");

        List<String> list = new ArrayList<>();

        appRef.whereEqualTo("uid", uid).get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                for (QueryDocumentSnapshot query : task.getResult()) {

                    String docId = query.getString("docId");
                    if (docId.equals("001"))
                        name = "Harsh";
                    else if (docId.equals("002"))
                        name = "Ashwim";
                    else if (docId.equals("003"))
                        name = "Savio";
                    else if (docId.equals("004"))
                        name = "Sarthak";

                    list.add(query.getId() + " " + name + " " + query.getBoolean("isVerified") + " " + query.getLong("token"));
                }
            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(TokenActivity.this, android.R.layout.simple_list_item_1, list);
        listToken.setAdapter(arrayAdapter);

    }
}