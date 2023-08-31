package com.example.school;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class FindIdActivity extends AppCompatActivity {
    RadioGroup rGroup;
    RadioButton rbtnID;
    Button btn_find_ok, btn_find_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);

        Toolbar toolbar = findViewById(R.id.toolbar_find_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rGroup = (RadioGroup) findViewById(R.id.rgroup_id);
        rbtnID = (RadioButton) findViewById(R.id.rbtnID);
        btn_find_ok = (Button) findViewById(R.id.btn_find_ok);
        btn_find_cancel = (Button) findViewById(R.id.btn_find_cancel);

        rbtnID.setChecked(true);

        // 비밀번호 찾기 라디오 버튼을 누르면 비밀번호 찾기 액티비티로 화면 전환
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkID) {
                switch (checkID){
                    case R.id.rbtnPass:
                        Intent intent_pass = new Intent(getApplicationContext(), FindPassActivity.class);
                        startActivity(intent_pass);
                        finish();
                        break;

                }
            }
        });

        // 확인 버튼을 누르면 확인 토스트 메시지 출력
        btn_find_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FindIdActivity.this, "확인", Toast.LENGTH_SHORT).show();
            }
        });

        // 취소 버튼을 누르면 화면 종료 후, 로그인 액티비티로 화면 전환
        btn_find_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}