package com.example.school;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LibraryActivity1 extends AppCompatActivity {
    TextView tvlibrary1, tvlibrary5;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library1);

        Toolbar toolbar = findViewById(R.id.toolbar_library);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvlibrary1 = (TextView) findViewById(R.id.tvlibrary1);
        tvlibrary5 = (TextView) findViewById(R.id.tvlibrary5);
        btnStart = (Button) findViewById(R.id.btnStart_library);

        // 텍스트 뷰의 텍스트를 부분적으로 편집하기 위한 코드
        String content1, content2;
        content1 = tvlibrary1.getText().toString();
        content2 = tvlibrary5.getText().toString();
        SpannableString spannableString1 = new SpannableString(content1);
        SpannableString spannableString2 = new SpannableString(content2);

        String word1 = "이용 안내서";
        int start1 = content1.indexOf(word1);
        int end1 = start1 + word1.length();
        spannableString1.setSpan(new StyleSpan(Typeface.BOLD), start1, end1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvlibrary1.setText(spannableString1);

        String word2 = "4시간 동안";
        int start2 = content2.indexOf(word2);
        int end2 = start2 + word2.length();
        spannableString2.setSpan(new StyleSpan(Typeface.BOLD), start2, end2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff0000")), start2, end2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvlibrary5.setText(spannableString2);

        // 시작하기 버튼을 누르면 열람실 예약하기 시작
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LibraryActivity2.class);
                startActivity(intent);
            }
        });
    }
}
