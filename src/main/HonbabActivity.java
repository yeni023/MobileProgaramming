package com.example.school;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.w3c.dom.Text;

public class HonbabActivity extends AppCompatActivity {
    ImageButton btnHelp, btnMinus, btnPlus, btnPrevious, btnNext;
    TextView tvClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honbab);

        Toolbar toolbar = findViewById(R.id.toolbar_honbab);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnMinus = (ImageButton) findViewById(R.id.btnMinus);
        btnPlus = (ImageButton) findViewById(R.id.btnPlus);
        btnPrevious = (ImageButton) findViewById(R.id.btnPrevious);
        btnNext = (ImageButton) findViewById(R.id.btnNext);
        btnHelp = (ImageButton) findViewById(R.id.btnHelp_restaurant2);
        tvClock = (TextView) findViewById(R.id.tvclock);

        // -버튼을 누르면 전시되는 시간이 5분 단위로 줄어듬 단, 20분일 경우 아무런 변화가 없다
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minutes = Integer.parseInt(tvClock.getText().toString());
                if(minutes > 20){
                    minutes = minutes - 5;
                    tvClock.setText(minutes+"");
                }
            }
        });

        // +버튼을 누르면 전시되는 시간이 5분 단위로 늘어남 단, 60분일 경우 아무런 변화가 없다
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minutes = Integer.parseInt(tvClock.getText().toString());
                if(minutes < 60){
                    minutes = minutes + 5;
                    tvClock.setText(minutes+"");
                }
            }
        });

        // < 버튼을 누르면 이전 페이지라는 토스트 메시지 출력
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HonbabActivity.this, "이전 페이지", Toast.LENGTH_SHORT).show();
            }
        });

        // > 버튼을 누르면 다음 페이지라는 토스트 메시지 출력
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HonbabActivity.this, "다음 페이지", Toast.LENGTH_SHORT).show();
            }
        });

        // 물음표 버튼을 누르면 도움말 페이지로 화면 전환
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_help = new Intent(getApplicationContext(), RestaurantHelpActivity2.class);
                startActivity(intent_help);
            }
        });
    }
}