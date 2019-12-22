package com.example.dec22th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public EditText txt_Phone;
    public EditText txt_Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_Phone = findViewById(R.id.txt_Phone);
        txt_Password = findViewById(R.id.txt_Password);
    }
    public void btnLogin_onClick(View v){
        Intent jumper = new Intent(this,MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("phone",txt_Phone.getText().toString());
        jumper.putExtra("password" , txt_Password.getText().toString());
        jumper.putExtras(bundle);
        startActivity(jumper);
    }
}
