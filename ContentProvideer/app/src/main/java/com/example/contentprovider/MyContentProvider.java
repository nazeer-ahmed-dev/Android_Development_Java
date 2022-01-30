package com.example.contentprovider;

import android.app.PendingIntent;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

import java.net.URI;

public class MyContentProvider extends ContentProvider {

    public class Directory
    {
        private static final String SCHEME = "content://";
        private static final String AUTHORITIES = "Student.MyProvider";
        private static final String PATH = "/login";

        public final Uri CONTENT_URI = URI.parse(SCHEME+AUTHORITIES+PATH);
    }
    DbHelper helper;
    public MyContentProvider() {
        helper = new DbHelper(getContext());

    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        // TODO: Implement this to handle requests for the MIME type of the data
        // at the given URI.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // TODO: Implement this to handle requests to insert a new row.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onCreate() {
        // TODO: Implement this to initialize your content provider on startup.
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
//        UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
//        // i was here : matching uri
//        //  uriMatcher.addURI();
        return helper.getData(projection,selection,selectionArgs,sortOrder);
        // TODO: Implement this to handle query requests from clients.
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}