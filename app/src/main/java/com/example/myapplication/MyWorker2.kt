package com.example.myapplication

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay


class MyWorker2(context: Context, params: WorkerParameters) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        Log.d("RRR","Start worker 2")
        delay(10000)
        Log.d("RRR","Finish worker 2")
        return Result.success()
    }
}
