package com.rssj.modelb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.rssj.modelbase.util.AndroidUtils;

public class ModelBActivity extends AppCompatActivity {

    Button btnA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_b);

        btnA = findViewById(R.id.btn_next_a);
        btnA.setOnClickListener(l -> {
            AndroidUtils.startAct(ModelBActivity.this, "com.rssj.modela.MainAActivity");
        });
    }
}