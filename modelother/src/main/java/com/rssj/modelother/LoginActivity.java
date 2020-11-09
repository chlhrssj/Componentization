package com.rssj.modelother;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.rssj.modelbase.util.AndroidUtils;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(l -> {
            AndroidUtils.startAct(LoginActivity.this, "com.rssj.modela.MainAActivity");
        });
    }
}