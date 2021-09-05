package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_record);
    }
    public void OnClick(View view)
    {
        EditText Rollnum;
        Rollnum=findViewById(R.id.editTextTextPersonName);
        if(Rollnum.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Enter Roll Number ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Record Deleted ", Toast.LENGTH_SHORT).show();
            Intent goback=new Intent(DeleteRecord.this,TeacherHome.class);
            startActivity(goback);
        }
    }
}