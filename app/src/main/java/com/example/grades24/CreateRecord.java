package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class CreateRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_record);
    }
    public void OnClick(View view)
    {
        EditText name,Rollnum,mt1,mt2,ass,finals,total,cp,quiz;
        name=findViewById(R.id.editTextTextPersonName4);
        Rollnum=findViewById(R.id.Rollno);
        mt1=findViewById(R.id.S1);
        mt2=findViewById(R.id.S2);
        ass=findViewById(R.id.assignment);
        finals=findViewById(R.id.FinalExam);
        total=findViewById(R.id.Total);
        cp=findViewById(R.id.Cp);
        quiz=findViewById(R.id.Quizzes);

        if(name.getText().toString().isEmpty()||Rollnum.getText().toString().isEmpty()||mt1.getText().toString().isEmpty()||mt2.getText().toString().isEmpty()||ass.getText().toString().isEmpty()||quiz.getText().toString().isEmpty()||finals.getText().toString().isEmpty()||total.getText().toString().isEmpty()||cp.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Enter all fields ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Record Created ", Toast.LENGTH_SHORT).show();
//            sleep(1.5);
            Intent goback=new Intent(CreateRecord.this,TeacherHome.class);
            startActivity(goback);
        }

    }
}