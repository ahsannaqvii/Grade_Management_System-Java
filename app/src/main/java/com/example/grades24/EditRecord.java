package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_record2);
    }
    public void OnClick(View View)
    {
        EditText RollNum;
        RollNum=findViewById(R.id.editTextTextPersonName3);
        if(RollNum.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Enter Roll Number ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Record Found ", Toast.LENGTH_SHORT).show();
            Intent goback=new Intent(EditRecord.this,TeacherHome.class);
            startActivity(goback);
        }
    }
}