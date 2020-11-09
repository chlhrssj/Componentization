package com.rssj.modelb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.rssj.modelbase.util.AndroidUtils;

public class MainBActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        button = findViewById(R.id.button);
        button.setOnClickListener(l -> {
            AndroidUtils.startAct(MainBActivity.this, "com.rssj.modelb.ModelBActivity");
        });
    }
}