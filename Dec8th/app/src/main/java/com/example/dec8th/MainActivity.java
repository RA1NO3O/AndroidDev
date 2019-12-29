package com.example.dec8th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView lbl_Time;
    private TextView lbl_welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbl_Time = findViewById(R.id.lbl_Time);
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");  //初始化时间格式
        lbl_Time.setText("启动时间："+df.format(new Date()));

        lbl_welcome=findViewById(R.id.lbl_welcome);
        lbl_welcome.setTextColor(Color.parseColor(generate_RandomColor()));

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        lbl_welcome.setTextColor(Color.parseColor(generate_RandomColor()));
    }

    public void btnCalc_onClick(View v){
        Intent jumper = new Intent(this,Calc.class);
        startActivity(jumper);
    }
    public void btnChat_onClick(View v){
        Intent jumper = new Intent(this, Login.class);
        startActivity(jumper);
    }
    public void btnOptions_onClick(View v){
        Intent jumper = new Intent(this,SettingsActivity.class);
        startActivity(jumper);
    }
    public String generate_RandomColor(){
        String r,g,b;
        Random random = new Random();
        r = Integer.toHexString(random.nextInt(200)).toUpperCase();
        g = Integer.toHexString(random.nextInt(200)).toUpperCase();
        b = Integer.toHexString(random.nextInt(200)).toUpperCase();
        r = r.length()==1 ? "0" + r : r ;
        g = g.length()==1 ? "0" + g : g ;
        b = b.length()==1 ? "0" + b : b ;
        return "#"+r+g+b;
    }
    public void lbl_welcome_onClick(View v){
        //refresh label color
        lbl_welcome.setTextColor(Color.parseColor(generate_RandomColor()));
    }
}