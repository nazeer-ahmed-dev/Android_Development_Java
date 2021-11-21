package com.example.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public final static String DBNAME = "TestDB";
    public final static int VERSION = 1;

    public DBHelper(Context context) {
        super(context,DBNAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String query = "CREATE TABLE LOGIN (ID INTEGER , USERNAME TEXT , PASSWORD TEXT)";
        db.execSQL(query);

        ContentValues cv = new ContentValues();
        cv.put("ID",1);
        cv.put("USERNAME","NAZEER");
        cv.put("PASSWORD","123");

        db.insert("LOGIN",null,cv);

    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertInto(int id , String name , String paswword)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("ID",id);
        cv.put("USERNAME",name);
        cv.put("PASSWORD",paswword);
        db.insert("LOGIN",null,cv);

    }
    public Cursor getUSErBYid()
    {
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT ID , USERNAME FROM LOGIN";
        return  db.rawQuery(query,null);
    }

}
