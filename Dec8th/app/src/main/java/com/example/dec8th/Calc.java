package com.example.dec8th;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends AppCompatActivity {
    private EditText txt_Input;
    private int calcmode;
    private boolean insertmode=true;
    private double lastNum=0.0;
    public double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        txt_Input=findViewById(R.id.txt_Input);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                    this.finish();
                    return true;
        }
        return  super.onOptionsItemSelected(item);
    }

    public void btnNumber_onClick(View v){      //数字
        Button btn_Num = (Button) v;
        if(txt_Input.getText().toString().equals("0")||!insertmode){
            txt_Input.setText(btn_Num.getText().toString());
            insertmode=true;
        }else {
            txt_Input.setText(txt_Input.getText().toString() + btn_Num.getText().toString());
        }
    }

    public void btnClear_onClick(View v){       //归零
        txt_Input.setText("0"); calcmode=0; lastNum=0.0; insertmode=true;
    }

    public void btnCalcmode_onClick(View v){    //运算符
        lastNum=Double.parseDouble(txt_Input.getText().toString());
        insertmode=false;
        Button btn_clicked =(Button) v;
        switch (btn_clicked.getText().toString()){
            case "+":
                calcmode=1;
                lastNum=Double.parseDouble(txt_Input.getText().toString());
                break;
            case "-":
                calcmode=2;
                lastNum=Double.parseDouble(txt_Input.getText().toString());
                break;
            case "×":
                calcmode=3;
                lastNum=Double.parseDouble(txt_Input.getText().toString());
                break;
            case "÷":
                calcmode=4;
                lastNum=Double.parseDouble(txt_Input.getText().toString());
                break;
        }
    }

    public void btnBackspace_onClick(View v){   //退格
        if(txt_Input.length()!=1) {
            txt_Input.setText(txt_Input.getText().toString().substring(0, txt_Input.length() - 1));
        }else{
            txt_Input.setText("0");
        }
    }

    public void btnDot_onClick(View v){     //小数点
        if(txt_Input.getText().toString().endsWith(".")){
            btnBackspace_onClick(v);
        }else if(!txt_Input.getText().toString().contains(".")){
            txt_Input.setText(txt_Input.getText().toString()+".");
        }
    }
    public void btnCalc_onClick(View v){
        switch (calcmode){
            case 1:
                result =lastNum+Double.parseDouble(txt_Input.getText().toString());
                txt_Input.setText(Double.toString(result));
                break;
            case 2:
                result =lastNum-Double.parseDouble(txt_Input.getText().toString());
                txt_Input.setText(Double.toString(result));
                break;
            case 3:
                result =lastNum*Double.parseDouble(txt_Input.getText().toString());
                txt_Input.setText(Double.toString(result));
                break;
            case 4:
                if(txt_Input.getText().equals("0")){
                    txt_Input.setText("出错");
                }else {
                    result =lastNum/Double.parseDouble(txt_Input.getText().toString());
                    txt_Input.setText(Double.toString(result));
                }
                break;
            default:
                txt_Input.setText(Double.toString(lastNum));
                break;
        }
        insertmode=false;
    }
}
