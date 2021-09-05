package com.example.grades24;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class LoginTeacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_teacher);
    }
    public void onClick(View view) {
        EditText email;
        EditText pass;
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        email = findViewById(R.id.editTextTextEmailAddress);
        pass = findViewById(R.id.editTextTextPassword);
        if (email.getText().toString().isEmpty() && pass.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter Email Address and Password", Toast.LENGTH_LONG).show();
        } else if (email.getText().toString().isEmpty() && !(pass.getText().toString().isEmpty())) {
            Toast.makeText(getApplicationContext(), "Enter Email Address ", Toast.LENGTH_SHORT).show();
        } else if (!(email.getText().toString().isEmpty()) && pass.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter Password ", Toast.LENGTH_SHORT).show();
        } else {
                if(!(email.getText().toString().trim().matches(emailPattern)))
                {
                    Toast.makeText(getApplicationContext(), "Enter Valid Email Address ", Toast.LENGTH_SHORT).show();
                }
                else
                {
            Intent oc = new Intent(LoginTeacher.this, TeacherHome.class);
            startActivity(oc);
        }
        }
    }
}