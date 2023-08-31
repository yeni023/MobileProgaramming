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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LockerActivity1 extends AppCompatActivity {
    TextView tvlocker1, tvlocker4, tvlocker5, tvlocker6;
    Button btnStart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locker1);

        Toolbar toolbar = findViewById(R.id.toolbar_locker);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvlocker1 = (TextView) findViewById(R.id.tvlocker1);
        tvlocker4 = (TextView) findViewById(R.id.tvlocker4);
        tvlocker5 = (TextView) findViewById(R.id.tvlocker5);
        tvlocker6 = (TextView) findViewById(R.id.tvlocker6);
        btnStart = (Button) findViewById(R.id.btnStart_locker);

        String content1, content4, content5, content6;
        content1 = tvlocker1.getText().toString();
        content4 = tvlocker4.getText().toString();
        content5 = tvlocker5.getText().toString();
        content6 = tvlocker6.getText().toString();
        SpannableString spannableString1 = new SpannableString(content1);
        SpannableString spannableString4 = new SpannableString(content4);
        SpannableString spannableString5 = new SpannableString(content5);
        SpannableString spannableString6 = new SpannableString(content6);

        String word1 = "이용 안내서";
        int start1 = content1.indexOf(word1);
        int end1 = start1 + word1.length();
        spannableString1.setSpan(new StyleSpan(Typeface.BOLD), start1, end1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvlocker1.setText(spannableString1);

        String word4 = "1인";
        int start4 = content4.indexOf(word4);
        int end4 = start4 + word4.length();
        spannableString4.setSpan(new StyleSpan(Typeface.BOLD), start4, end4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvlocker4.setText(spannableString4);

        String word5 = "1학기 동안";
        int start5 = content5.indexOf(word5);
        int end5 = start5 + word5.length();
        spannableString5.setSpan(new StyleSpan(Typeface.BOLD), start5, end5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvlocker5.setText(spannableString5);

        String word6 = "일 수만큼 패널티";
        int start6 = content6.indexOf(word6);
        int end6 = start6 + word6.length();
        spannableString6.setSpan(new ForegroundColorSpan(Color.parseColor("#ff0000")), start6, end6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvlocker6.setText(spannableString6);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LockerStateActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_locker, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.lockerMyPage:
                Toast.makeText(getApplicationContext(), "마이페이지", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.lockerMap:
                Toast.makeText(getApplicationContext(), "지도", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}
