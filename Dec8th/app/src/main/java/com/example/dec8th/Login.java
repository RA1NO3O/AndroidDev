package com.example.dec8th;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText txt_Phone;
    private EditText txt_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_Phone=findViewById(R.id.txt_Phone);
        txt_Password=findViewById(R.id.txt_Password);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return  super.onOptionsItemSelected(item);
    }
    public void btnExit_onClick(View v){
        Intent jumper = new Intent(this,MainActivity.class);
        startActivity(jumper);
    }

    public void btnLogin_onClick(View v){
        MyDialog myDialog;
        if(txt_Phone.getText().toString().isEmpty()||txt_Password.getText().toString().isEmpty()) {
            myDialog = new MyDialog(this, "登录信息不完整!请重新输入!");
            myDialog.setTitle("登录失败");
            myDialog.show();
        }else{
            myDialog = new MyDialog(this,"登录成功!");
            myDialog.setTitle("提示");
            myDialog.show();
        }
    }
}
