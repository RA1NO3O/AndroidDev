package com.example.nov10th;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.i("Activity2Life","调用onCreate()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Activity2Life","调用onStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Activity2Life","调用onResume()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Activity2Life","调用onPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Activity2Life","调用onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Activity2Life","调用onDestroy()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Activity2Life","调用onRestart()");
    }
}
