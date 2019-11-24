package com.example.nov24th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_signup;
    private Button btn_signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_signin=findViewById(R.id.button2);
        btn_signup=findViewById(R.id.button);
    }

    public void setBtn_signin(View v){
        Intent x = new Intent(this,Main2Activity.class);
        startActivity(x);
    }
    public void setBtn_signup(View v){
        Intent y = new Intent(this,SignupActivity.class);
        startActivity(y);
    }
}
