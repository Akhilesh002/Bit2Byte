package com.akhilesh002.bit2byte;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DeanActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private EditText deanInputET;
    private Button viewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean);

        toolbar = findViewById(R.id.dean_activity_app_bar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Search Dean Office");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitleTextColor(Color.WHITE);

        deanInputET = findViewById(R.id.dean_input_text);
        viewBtn = findViewById(R.id.view_dean);

        viewBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == viewBtn){
            // write the code here for access the data from database for dean
        }
    }
}
