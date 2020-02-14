package com.example.something.ui.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "contactDB";
    public static final String TABLE_CONTACTS = "contacts";
    public static final int SCHEMA_VERSION = 1;
    //public static com.example.something.ui.login.DatabaseHelper singleton = null;

    public static final String KEY_ID = "_id";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_MAIL = "mail";

    /*synchronized static com.example.something.ui.login.DatabaseHelper getInstance(Context ctxt) {
        if (singleton == null) {
            singleton = new com.example.something.ui.login.DatabaseHelper(ctxt.getApplicationContext());
        }
        return (singleton);
    }*/

    public DatabaseHelper(Context ctxt) {
        super(ctxt, DATABASE_NAME, null, SCHEMA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_CONTACTS + "(" + KEY_ID +
                " integer primary key," + KEY_MAIL + " text," +
                KEY_PASSWORD + " text" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        throw new RuntimeException("This should not be called");
    }
}