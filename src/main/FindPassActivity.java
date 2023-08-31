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

public class FindPassActivity extends AppCompatActivity {
    RadioGroup rGroup;
    RadioButton rbtnPass;
    Button btn_find_ok, btn_find_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_pass);

        Toolbar toolbar = findViewById(R.id.toolbar_find_pass);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rGroup = (RadioGroup) findViewById(R.id.rgroup_pass);
        rbtnPass = (RadioButton) findViewById(R.id.rbtnPass);
        btn_find_ok = (Button) findViewById(R.id.btn_find_ok);
        btn_find_cancel = (Button) findViewById(R.id.btn_find_cancel);

        rbtnPass.setChecked(true);

        // 아이디 찾기 라디오 버튼을 누르면 아이디 찾기 액티비티로 인텐트
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkID) {
                switch (checkID){
                    case R.id.rbtnID:
                        Intent intent_id = new Intent(getApplicationContext(), FindIdActivity.class);
                        startActivity(intent_id);
                        finish();
                        break;
                }
            }
        });

        // 확인 버튼을 누르면 확인 토스트 메시지 출력
        btn_find_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FindPassActivity.this, "확인", Toast.LENGTH_SHORT).show();
            }
        });

        // 취소 버튼을 누르면 화면 종료 후, 로그인 액티비티로 돌아감
        btn_find_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
