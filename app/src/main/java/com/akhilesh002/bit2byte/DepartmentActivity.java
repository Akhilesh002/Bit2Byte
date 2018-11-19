package com.akhilesh002.bit2byte;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DepartmentActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button deanBtn;
    private Button programChairBtn;
    private Button mentorOffice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        toolbar = findViewById(R.id.activity_department_app_bar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Department");
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        deanBtn = findViewById(R.id.dean_office);
        programChairBtn = findViewById(R.id.program_chair_office);
        mentorOffice = findViewById(R.id.mentor_office);

        deanBtn.setOnClickListener(this);
        programChairBtn.setOnClickListener(this);
        mentorOffice.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == deanBtn){
            Intent deanIntent = new Intent(DepartmentActivity.this, DeanActivity.class);
            startActivity(deanIntent);
            Toast.makeText(this, "Dean", Toast.LENGTH_SHORT).show();
        }
        if (v == programChairBtn){
            Intent programChairIntent = new Intent(DepartmentActivity.this, ProgramChairActivity.class);
            startActivity(programChairIntent);
            Toast.makeText(this, "Program Chair", Toast.LENGTH_SHORT).show();
        }
        if (v == mentorOffice){
            Intent mentorIntent = new Intent(DepartmentActivity.this, MentorActivity.class);
            startActivity(mentorIntent);
            Toast.makeText(this, "Mentor", Toast.LENGTH_SHORT).show();
        }
    }
}
