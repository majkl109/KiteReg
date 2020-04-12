package com.majkl.kitereg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    //views
    private FloatingActionButton addRecordbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
        addRecordbtn = findViewById(R.id.addRecordBtn);

        //on click start AddUpdate activity
        addRecordbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //starting AddUpdate activity
                startActivity(new Intent(MainActivity.this,AddUpdateActivity.class));

            }

        });
    }
}
