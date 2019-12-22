package com.example.dec22th;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lbl_Welcome;
    private TextView lbl_Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbl_Welcome = findViewById(R.id.lbl_Welcome);
        lbl_Password = findViewById(R.id.lbl_Password);
        Bundle bundle = getIntent().getExtras();
        String phone = (String) bundle.get("phone");
        lbl_Welcome.setText("欢迎，"+phone);
        lbl_Password.setText(("您的密码： "+getIntent().getStringExtra("password")));
    }
}
