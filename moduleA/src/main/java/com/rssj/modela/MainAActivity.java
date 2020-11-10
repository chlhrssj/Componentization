package com.rssj.modela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.rssj.modelbase.util.AndroidUtils;

public class MainAActivity extends AppCompatActivity {

    Button btnB;
    Button btnC;
    Button btnD;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_a);

        btnB = findViewById(R.id.btn_next_b);
        btnB.setOnClickListener(l -> {
            AndroidUtils.startAct(MainAActivity.this, "com.rssj.modelb.ModelBActivity");
        });

        btnC = findViewById(R.id.btn_next_c);
        btnC.setOnClickListener(l -> {
            AndroidUtils.startAct(MainAActivity.this, "com.rssj.modela.CActivity");
        });

        btnD = findViewById(R.id.btn_next_d);
        btnD.setOnClickListener(l -> {
            AndroidUtils.startAct(MainAActivity.this, "com.rssj.modelb.DActivity");
        });

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(l -> {
            AndroidUtils.startAct(MainAActivity.this, "com.rssj.modelother.LoginActivity");
        });

    }
}