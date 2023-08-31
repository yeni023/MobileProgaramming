package com.example.school;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class GeneralBabActivity extends AppCompatActivity {
    ImageButton btnHelp_generalbab, btnMinus_general, btnPlus_general, btnMinus2_general, btnPlus2_general, btnPrevious_general, btnNext_general;
    TextView tvclock_general, tvpeople_general;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generalbab);

        Toolbar toolbar = findViewById(R.id.toolbar_generalbab);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnHelp_generalbab = (ImageButton) findViewById(R.id.btnHelp_generalbab);
        btnMinus_general = (ImageButton) findViewById(R.id.btnMinus_general);
        btnPlus_general = (ImageButton) findViewById(R.id.btnPlus_general);
        btnMinus2_general = (ImageButton) findViewById(R.id.btnMinus2_general);
        btnPlus2_general = (ImageButton) findViewById(R.id.btnPlus2_general);
        btnPrevious_general = (ImageButton) findViewById(R.id.btnPrevious_general);
        btnNext_general = (ImageButton) findViewById(R.id.btnNext_general);
        tvclock_general = (TextView) findViewById(R.id.tvclock_general);
        tvpeople_general = (TextView) findViewById(R.id.tvpeople_general);

        // -버튼을 누르면 전시되는 시간이 5분 단위로 줄어듬 단, 20분일 경우 아무런 변화가 없다
        btnMinus_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minutes = Integer.parseInt(tvclock_general.getText().toString());
                if(minutes > 20){
                    minutes = minutes - 5;
                    tvclock_general.setText(minutes+"");
                }
            }
        });

        // +버튼을 누르면 전시되는 시간이 5분 단위로 늘어남 단, 60분일 경우 아무런 변화가 없다
        btnPlus_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minutes = Integer.parseInt(tvclock_general.getText().toString());
                if(minutes < 60){
                    minutes = minutes + 5;
                    tvclock_general.setText(minutes+"");
                }
            }
        });

        // -버튼을 누르면 전시되는 인원이 1명씩 줄어듬 단, 1명일 경우 아무런 변화가 없다
        btnMinus2_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int people = Integer.parseInt(tvpeople_general.getText().toString());
                if(people > 1){
                    people = people - 1;
                    tvpeople_general.setText(people+"");
                }
            }
        });

        // +버튼을 누르면 전시되는 인원이 1명씩 늘어남 단, 4명일 경우 아무런 변화가 없다
        btnPlus2_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int people = Integer.parseInt(tvpeople_general.getText().toString());
                if(people < 4){
                    people = people + 1;
                    tvpeople_general.setText(people+"");
                }
            }
        });

        // < 버튼을 누르면 이전 페이지라는 토스트 메시지 출력
        btnPrevious_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GeneralBabActivity.this, "이전 페이지", Toast.LENGTH_SHORT).show();
            }
        });

        // > 버튼을 누르면 다음 페이지라는 토스트 메시지 출력
        btnNext_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GeneralBabActivity.this, "다음 페이지", Toast.LENGTH_SHORT).show();
            }
        });

        // 물음표 버튼을 누르면 도움말 페이지로 화면 전환
        btnHelp_generalbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_help = new Intent(getApplicationContext(), RestaurantHelpActivity2.class);
                startActivity(intent_help);
            }
        });
    }
}
