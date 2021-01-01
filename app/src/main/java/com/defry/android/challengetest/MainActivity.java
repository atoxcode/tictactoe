package com.defry.android.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRegisterClick(View view){
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        EditText inputFirstName = findViewById(R.id.inputFirstName);
        txtFirstName.setText("First Name: " + inputFirstName.getText().toString());

        TextView txtLastName = findViewById(R.id.txtLastName);
        EditText inputLastName = findViewById(R.id.inputLastName);
        txtLastName.setText("Last Name: " + inputLastName.getText().toString());

        TextView txtEmail = findViewById(R.id.txtEmail);
        EditText inputEmail = findViewById(R.id.inputEmail);
        txtEmail.setText("Email: " + inputEmail.getText().toString());

    }
}