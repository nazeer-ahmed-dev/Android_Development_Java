package com.example.contactsaveinsqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public final static String DBNAME = "TestDB";
    public final static int VERSION = 1;
    public DBHelper(Context context)
    {
        super(context,DBNAME,null,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE CONTACT (NAME TEXT ,PHONE INTEGER , STREET TEXT ,EMAIL TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
    }
    public void insertInto(String name , int number, String Street , String email)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NAME",name);
        cv.put("PHONE",number);
        cv.put("STREET",Street);
        cv.put("EMAIL",email);

        db.insert("CONTACT",null,cv);
    }
    public Cursor GetDate()
    {
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT NAME FROM CONTACT";
        return  db.rawQuery(query,null);
    }

}
