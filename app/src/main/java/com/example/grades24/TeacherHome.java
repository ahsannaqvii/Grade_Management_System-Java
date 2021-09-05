package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TeacherHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home);
    }
    public void CreateOnClick(View view)
    {
        Intent coc= new Intent(TeacherHome.this,CreateRecord.class);
        startActivity(coc);
    }
    public void ViewOnClick(View view)
    {
        Intent voc= new Intent(TeacherHome.this,ViewAllRecords.class);
        startActivity(voc);
    }
    public void SearchOnClick(View view)
    {
        Intent soc= new Intent(TeacherHome.this,SearchRecord.class);
        startActivity(soc);
    }
    public void EditOnClick(View view)
    {
        Intent edc= new Intent(TeacherHome.this,EditRecord.class);
        startActivity(edc);
    }
    public void DeleteOnClick(View view)
    {
        Intent doc= new Intent(TeacherHome.this,DeleteRecord.class);
        startActivity(doc);
    }
    public void logout(View view)
    {
        Intent lo=new Intent(TeacherHome.this,MainActivity.class);
        startActivity(lo);
    }

}