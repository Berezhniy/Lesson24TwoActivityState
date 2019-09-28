package ru.startandroid.lesson24twoactivitystate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";

    Button btnActTwo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //нахожу View по id
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        //вешаю на неё слушатель
        btnActTwo.setOnClickListener(this);
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "MainActivity: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "MainActivity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //выводим в логах название жизненного цикла и активность которой он пренадлежит
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    public void onClick(View v) {
        //создаю и инициализирую intent указывая нс какой и на какую активность необходимо перейти
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }
}
