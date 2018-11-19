package com.akhilesh002.bit2byte;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MentorActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private EditText mentorInputET;
    private Button viewMentorBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);

        toolbar = findViewById(R.id.mentor_activity_app_bar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Search Mentor Office");
        toolbar.setTitleTextColor(Color.WHITE);

        mentorInputET= findViewById(R.id.mentor_input_text);
        viewMentorBtn = findViewById(R.id.view_mentor);

        viewMentorBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == viewMentorBtn){
            //write the code here which extract the data from database for mentor
        }
    }
}
