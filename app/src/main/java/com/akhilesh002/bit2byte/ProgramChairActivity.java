package com.akhilesh002.bit2byte;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProgramChairActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private EditText programChairInputET;
    private Button viewPCBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_chair);

        toolbar = findViewById(R.id.program_chair_activity_app_bar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Search Program Chair Office");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitleTextColor(Color.WHITE);

        programChairInputET = findViewById(R.id.program_chair_input_text);
        viewPCBtn = findViewById(R.id.view_program_chair);

        viewPCBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == viewPCBtn){
            // write the code here which extract the data from database for Program Chair
        }
    }
}
