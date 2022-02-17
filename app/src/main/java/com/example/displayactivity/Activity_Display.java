package com.example.displayactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Display extends AppCompatActivity {

    private TextView displayUserName;
    private TextView displayUserEmail;
    private Button backButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displayUserName = findViewById(R.id.displayName);
        displayUserEmail = findViewById(R.id.displayEmail);
        backButton = findViewById(R.id.back);

        String userName = getIntent().getStringExtra("Name");
        String userEmail = getIntent().getStringExtra("EmailId");

        displayUserEmail.setText(userEmail);
        displayUserName.setText(userName);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}