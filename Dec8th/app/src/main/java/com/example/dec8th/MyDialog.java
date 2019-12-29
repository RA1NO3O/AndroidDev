package com.example.dec8th;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
public class MyDialog extends Dialog{
    private String dialogName;
    private TextView tvMsg;
    private Button btnOK;
    private Button btnCancel;
    public MyDialog(Context context,String dialogName){
        super(context);
        this.dialogName=dialogName;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.my_dialog);
        tvMsg = findViewById(R.id.tv_msg);
        btnOK = findViewById(R.id.btn_ok);
        btnCancel = findViewById(R.id.btn_cancel);
        tvMsg.setText(dialogName);
        btnOK.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                dismiss();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dismiss();
            }
        });
    }
}
