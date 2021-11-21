package com.example.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelperr extends SQLiteOpenHelper {

    public final static String DBNAME = "TestDB";
    public final static int VERSION = 1;
    public DBhelperr(Context context)
    {
        super(context,DBNAME,null,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE REGISTRATION (ID INTEGER ,USERNAME TEXT , EMAIL TEXT ,PASSWORD TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
    }
    public void insertInto(int id , String username , String Email , String password)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("ID",id);
        cv.put("USERNAME",id);
        cv.put("EMAIL",id);
        cv.put("PASSWORD",id);

        db.insert("REGISTRATION",null,cv);


    }
   public Cursor GetDate()
    {
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT ID , USERNAME FROM REGISTRATION";
        return  db.rawQuery(query,null);
    }

}
