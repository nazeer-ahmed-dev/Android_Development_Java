package com.example.workmanager;

import android.content.Context;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class UploadWorker extends Worker {

    public UploadWorker(Context context , WorkerParameters params)
    {
        super(context,params);
    }
    public Result doWork()
    {
        // do the work  here--in this case , upload the images


        // Indicates whether the work findshed successfully with the Result
        return Result.success();
    }
}
