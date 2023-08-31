package com.example.school;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class VersionInfoActivity extends AppCompatActivity {
    TextView tvPresentVer, tvLatestVer, tvDisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version_info);

        Toolbar toolbar = findViewById(R.id.toolbar_version);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvPresentVer = (TextView) findViewById(R.id.tvPresentVer);
        tvLatestVer = (TextView) findViewById(R.id.tvLatestVer);
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        String content1, content2;
        content1 = tvPresentVer.getText().toString();
        content2 = tvLatestVer.getText().toString();

        SpannableString spannableString1 = new SpannableString(content1);
        SpannableString spannableString2 = new SpannableString(content2);

        String word1 = "1.0.0";
        int start1 = content1.indexOf(word1);
        int end1 = start1 + word1.length();
        spannableString1.setSpan(new ForegroundColorSpan(Color.parseColor("#ffb746")), start1, end1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvPresentVer.setText(spannableString1);

        String word2 = "1.0.0";
        int start2 = content2.indexOf(word1);
        int end2 = start2 + word2.length();
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor("#ffb746")), start2, end2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvLatestVer.setText(spannableString2);

        if(word1 == word2) {
            tvDisplay.setText("최신버전입니다.");
        } else{
            tvDisplay.setText("최신버전이 아닙니다.");
        }
    }
}
