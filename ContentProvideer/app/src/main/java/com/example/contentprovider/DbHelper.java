package com.example.contentprovider;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "Student";
    public static final String table = "login";
     public DbHelper(Context context)
    {
        super(context,DBNAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }
    public Cursor getData(String[] projectList,String args, String[] argList , String sortOrder )
    {
            SQLiteDatabase db = getReadableDatabase();
            Cursor cursor = db.query( table,projectList,args,argList,null,null,sortOrder);
            return  cursor;
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
