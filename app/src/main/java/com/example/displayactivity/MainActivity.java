package com.example.displayactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText emailId;
    private CheckBox subscribe;
    private Button submit;
    private TextView displayWarning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editName);
        emailId = findViewById(R.id.editEmail);
        subscribe = findViewById(R.id.subscribe);
        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();
                String userEmailId = emailId.getText().toString();
                boolean isChecked = subscribe.isChecked();
                displayWarning = findViewById(R.id.warning);

                if (isChecked) {
//                boolean subScribe = subscribe.
                    displayWarning.setText("");

                    Intent intent = new Intent(MainActivity.this, Activity_Display.class);
                    intent.putExtra("Name", userName);
                    intent.putExtra("EmailId", userEmailId);
                    startActivity(intent);
                }
                else {
                    displayWarning.setText("Select Checkbox");
                }

            }
        });
    }
}