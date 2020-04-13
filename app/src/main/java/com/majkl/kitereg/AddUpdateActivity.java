package com.majkl.kitereg;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddUpdateActivity extends AppCompatActivity {

    //views
    private CircleImageView profilePic;
    private EditText nameTxt, phoneTxt, emailTxt, dobTxt, remarkTxt;
    private FloatingActionButton saveBtn;

    //permissions
    private static final int CAMERA_REQUEST_CODE = 10;
    private static final int STORAGE_REQUEST_CODE = 11;

    //image pick constants
    private static final int IMAGE_PICK_CMAERA_REQUEST_CODE = 12;
    private static final int IMAGE_PICK_GALLERY_REQUEST_CODE = 13;

    //arrays of permissions
    private String[] cameraPermissions;//camera and storage
    private String[] storagePermissions;//only storage

    private Uri imageUri;

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

        //initialize permissions arrays
        cameraPermissions = new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
        storagePermissions = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE};


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

    private boolean checkStoragePermission(){
        boolean result = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == (PackageManager.PERMISSION_GRANTED);
        return result;
    }

    private void requestStoragePermission(){
        ActivityCompat.requestPermissions(this, storagePermissions,STORAGE_REQUEST_CODE);
    }


    private boolean checkCameraPermissions(){
        boolean result = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == (PackageManager.PERMISSION_GRANTED);
        boolean result1 = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        return result && result1;
    }

    private void requestCamerPermission(){

        ActivityCompat.requestPermissions(this, cameraPermissions, CAMERA_REQUEST_CODE);
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // going back by clicking back button
        return super.onSupportNavigateUp();
    }
}
