package com.majkl.kitereg;

public class Constants {

    //name of DB
    public static final String DB_NAME = "KITEREG_DB";
    //DB version
    public static final int DB_VERSION = 1;
    //table name
    public static final String TABLE_NAME = "KITEREG_TABLE";
    //columns/fields of table
    public static final String C_ID = "ID";
    public static final String C_IMAGE = "IMAGE";
    public static final String C_NAME = "NAME";
    public static final String C_PHONE = "PHONE";
    public static final String C_EMAIL = "EMAIL";
    public static final String C_DOB = "DOB";
    public static final String C_REMARKS = "REMARKS",
    public static final String C_ADDED_TIMESTAMP = "ADDED_TIME_STAMP";
    public static final String C_UPDATED_TIME_STAMP = "UPDATED_TIME_STAMP";
    //create table query
    public static final String CREATE_TABLE = "CREATE_TABLE " + TABLE_NAME + "("
            + C_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
            + C_IMAGE + " TEXT,"
            + C_NAME + " TEXT,"
            + C_PHONE + " TEXT,"
            + C_EMAIL + " TEXT,"
            + C_DOB + " TEXT,"
            + C_REMARKS + " TEXT,"
            + C_ADDED_TIMESTAMP + " TEXT,"
            + C_UPDATED_TIME_STAMP + " TEXT"
            + ")";
}

