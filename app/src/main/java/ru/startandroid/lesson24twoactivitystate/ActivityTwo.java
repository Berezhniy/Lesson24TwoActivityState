package ru.startandroid.lesson24twoactivitystate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityTwo extends AppCompatActivity {

    final String TAG = "States";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "ActivityTwo: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "ActivityTwo: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "ActivityTwo: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "ActivityTwo: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "ActivityTwo: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "ActivityTwo: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "ActivityTwo: onDestroy()");
    }
}