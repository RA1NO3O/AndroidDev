package com.example.nov24th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void Login(View v){
        Intent z = new Intent(this,Main2Activity.class);
        startActivity(z);
    }
    public void setBtn_back(View v){
        Intent zz = new Intent(this,MainActivity.class);
        startActivity(zz);
    }
}
