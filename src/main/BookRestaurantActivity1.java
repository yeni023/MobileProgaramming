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
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BookRestaurantActivity1 extends AppCompatActivity {
    TextView tvRestaurant1;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_restaurant1);

        Toolbar toolbar = findViewById(R.id.toolbar_restaurant);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvRestaurant1 = (TextView) findViewById(R.id.tvrestaurant_1);
        btnStart = (Button) findViewById(R.id.btnStart_restaurant);
        
        // 텍스트 뷰의 텍스트를 부분적으로 편집하기 위한 코드
        String content1;
        content1 = tvRestaurant1.getText().toString();
        SpannableString spannableString1 = new SpannableString(content1);

        String word1 = "이용 안내서";
        int start1 = content1.indexOf(word1);
        int end1 = start1 + word1.length();
        spannableString1.setSpan(new StyleSpan(Typeface.BOLD), start1, end1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvRestaurant1.setText(spannableString1);

        // 시작하기 버튼을 누르면 식당 좌석 예약하기 시작
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BookRestaurantActivity2.class);
                startActivity(intent);
            }
        });
    }
}
