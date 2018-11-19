package com.akhilesh002.bit2byte;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button classBtn;
    private Button departmentBtn;
    private Button facultyBtn;
    private Button libraryBtn;
    private Button labClassBtn;
    private Button otherBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.activity_main_app_bar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        toolbar.setTitleTextColor(Color.WHITE);

        classBtn = findViewById(R.id.class_search);
        departmentBtn = findViewById(R.id.department_search);
        facultyBtn = findViewById(R.id.faculty_search);
        libraryBtn = findViewById(R.id.library);
        labClassBtn = findViewById(R.id.lab_class_room);
        otherBtn = findViewById(R.id.other_search);

        classBtn.setOnClickListener(this);
        departmentBtn.setOnClickListener(this);
        facultyBtn.setOnClickListener(this);
        libraryBtn.setOnClickListener(this);
        labClassBtn.setOnClickListener(this);
        otherBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == classBtn){
            Toast.makeText(this, "Class", Toast.LENGTH_SHORT).show();
        }
        if (v == departmentBtn){
            Intent departmentIntent = new Intent(MainActivity.this, DepartmentActivity.class);
            startActivity(departmentIntent);
            Toast.makeText(this, "Department", Toast.LENGTH_SHORT).show();
        }
        if (v == facultyBtn){
            Toast.makeText(this, "Faculty", Toast.LENGTH_SHORT).show();
        }
        if (v == libraryBtn){
            Toast.makeText(this, "Library", Toast.LENGTH_SHORT).show();
        }
        if (v == labClassBtn){
            Toast.makeText(this, "Lab Class Room", Toast.LENGTH_SHORT).show();
        }
        if (v == otherBtn){
            Toast.makeText(this, "Other", Toast.LENGTH_SHORT).show();
        }
    }
}
