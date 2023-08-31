package com.example.school;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BookRestaurantActivity2 extends AppCompatActivity {
    ImageButton btnhonbab, btngeneralbab, btnHelp;
    Button btnCheckBook, btnExtend, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_restaurant2);

        Toolbar toolbar = findViewById(R.id.toolbar_restaurant);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btngeneralbab = (ImageButton) findViewById(R.id.btngeneralbab);
        btnhonbab = (ImageButton) findViewById(R.id.btnhonbab);
        btnCheckBook = (Button) findViewById(R.id.btnCheckBook);
        btnExtend = (Button) findViewById(R.id.btnExtend);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnHelp = (ImageButton) findViewById(R.id.btnHelp_restaurant);

        // 혼밥존 예약을 하기 위한 버튼
        btnhonbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_honbab = new Intent(getApplicationContext(), HonbabActivity.class);
                startActivity(intent_honbab);
            }
        });

        // 일반존 예약을 하기 위한 버튼
        btngeneralbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_general = new Intent(getApplicationContext(), GeneralBabActivity.class);
                startActivity(intent_general);
            }
        });

        // 나의 예약 정보 확인 버튼을 누르면 토스트 메시지 출력
        btnCheckBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "예약 확인", Toast.LENGTH_SHORT).show();
            }
        });

        // 식사 시간 연장하기 버튼을 누르면 토스트 메시지 출력
        btnExtend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "연장하기", Toast.LENGTH_SHORT).show();
            }
        });

        // 퇴장 하기 버튼을 누르면 토스트 메시지 출력
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "퇴장하기", Toast.LENGTH_SHORT).show();
            }
        });

        // 물음표 버튼을 클릭하면 도움말 화면으로 전환
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RestaurantHelpActivity1.class);
                startActivity(intent);
            }
        });
    }
}
