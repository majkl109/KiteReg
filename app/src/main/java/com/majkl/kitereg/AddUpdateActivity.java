package com.majkl.kitereg;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddUpdateActivity extends AppCompatActivity {

    private CircleImageView profilePic;
    private EditText nameTxt, phoneTxt, emailTxt, dobTxt, remarkTxt;
    private FloatingActionButton saveBtn;

    //actionbar
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_update);

        //initialise
        actionBar = getSupportActionBar();

        //title of ActionBar
        actionBar.setTitle("AddRecord");

        //back button
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);

        //initialise views
        profilePic = findViewById(R.id.profile_pic);
        nameTxt = findViewById(R.id.nameTxt);
        phoneTxt = findViewById(R.id.phoneTxt);
        emailTxt = findViewById(R.id.emailTxt);
        dobTxt = findViewById(R.id.dobTxt);
        remarkTxt = findViewById(R.id.remarkTxt);
        saveBtn = findViewById(R.id.saveBtn);

        //clicking to show image pic dialog
        profilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //clicking to save
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // going back by clicking back button
        return super.onSupportNavigateUp();
    }
}
