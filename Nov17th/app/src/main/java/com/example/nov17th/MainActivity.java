package com.example.nov17th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txt_phoneNum;
    private EditText txt_msgContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_phoneNum=findViewById(R.id.phoneTxtBox);
        txt_msgContent=findViewById(R.id.msgTxtBox);
    }
    public void Btn_openBrowser(View v){
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://www.baidu.com/"));
        startActivity(intent);
    }
    public void Btn_openMessage(View v){
        Uri link = Uri.parse("smsto:"+txt_phoneNum.getText());
        Intent intent = new Intent(Intent.ACTION_VIEW,link);
        intent.putExtra("sms_body",txt_msgContent.getText().toString());
        startActivity(intent);
    }
}
