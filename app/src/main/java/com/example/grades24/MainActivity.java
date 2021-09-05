package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View view)
    {
        Intent gs=new Intent(MainActivity.this,LoginTeacher.class);
        startActivity(gs);
    }
    public void ClickStudent(View view)
    {
        Intent student=new Intent(MainActivity.this,LoginStudent.class);
        startActivity(student);
    }
    public  void OnSignUp(View view)
    {
        Intent signup= new Intent(MainActivity.this,SignUp.class);
        startActivity(signup);
    }
}