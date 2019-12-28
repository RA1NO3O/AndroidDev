package com.example.dec8th;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void btnExit_onClick(View v){
        Intent jumper = new Intent(this,MainActivity.class);
        startActivity(jumper);
    }

    public void btnLogin_onClick(View v){
        Intent jumper = new Intent(this,MainActivity.class);
        startActivity(jumper);
    }
}
