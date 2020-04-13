package com.majkl.kitereg;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class KiteregDBhelper extends SQLiteOpenHelper {
    public KiteregDBhelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creating table
        db.execSQL(Constants.CREATE_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //dropping table if exists
        db.execSQL("DROP TABLE IF EXISTS "+ Constants.TABLE_NAME);
        //create table again
        onCreate(db);

    }
    //inserting data to db
    public long insertData(String image,String name, String phone, String email,
                           String dob, String remarks, String addedTime, String updatedTime){
        //getting writable database to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        //inserting data
        values.put(Constants.C_IMAGE, image);
        values.put(Constants.C_NAME, name);
        values.put(Constants.C_PHONE, phone);
        values.put(Constants.C_EMAIL, email);
        values.put(Constants.C_DOB, dob);
        values.put(Constants.C_REMARKS, remarks);
        values.put(Constants.C_ADDED_TIMESTAMP, addedTime);
        values.put(Constants.C_UPDATED_TIME_STAMP, updatedTime);

        //inserting row
        long id = db.insert(Constants.TABLE_NAME, null, values);

        //close db connection
        db.close();

        //return id of inserted data
        return id;
    }

}

