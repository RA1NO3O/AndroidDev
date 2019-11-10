package com.example.nov10th;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用onCreate()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivityLife","调用onStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivityLife","调用onResume()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivityLife","调用onPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivityLife","调用onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivityLife","调用onDestroy()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivityLife","调用onRestart()");
    }
    public void showDialog(View v){
        switch (v.getId()){
            case R.id.button0:
                AlertDialog dialog;
                dialog=new AlertDialog.Builder(MainActivity.this).setTitle("Dialog对话框").setMessage("是否确定退出?")
                    .setIcon(R.mipmap.ic_launcher)
                    .setPositiveButton("确定",null)
                    .setNegativeButton("取消",null)
                    .create();
                dialog.show();
                break;
            case R.id.button1:
                new AlertDialog.Builder(MainActivity.this)
                .setTitle("请选择性别")
                .setIcon(R.mipmap.ic_launcher)
                .setSingleChoiceItems(new String[]{"男", "女"}, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setPositiveButton("确定",null)
                .show();
                break;
            case R.id.button2:
                new AlertDialog.Builder(MainActivity.this)
                    .setTitle("请添加兴趣爱好!")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMultiChoiceItems(new String[]{"旅游","美食","汽车","宠物"},null,null)
                    .setPositiveButton("确定",null)
                .show();
                break;
            case R.id.button3:
                ProgressDialog prodialog;
                prodialog = new ProgressDialog(MainActivity.this);
                prodialog.setTitle("进度条对话框");
                prodialog.setIcon(R.mipmap.ic_launcher);
                prodialog.setMessage("正在下载请等候...");
                prodialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                prodialog.show();
                break;
            case R.id.button4:
                Toast.makeText(this,"Hello,Toast", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
//              setContentView(R.layout.my_dialog);
                MyDialog myDialog = new MyDialog(this,"我是自定义的Dialog");
                myDialog.show();
                break;
        }
    }
    public void swichActivity(View v){
        Intent activity2 = new Intent(MainActivity.this,Activity2.class);
        startActivity(activity2);
    }
}
