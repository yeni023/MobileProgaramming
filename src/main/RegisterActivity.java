package com.example.school;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity {
    CheckBox chk1, chk2;
    Button btnDoubChk, btnNumSend, btnNumChk, btnRegister, btnpassChk;
    TextView edtpass1, edtpass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = findViewById(R.id.toolbar_register);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);

        edtpass1 = (TextView) findViewById(R.id.edtpass1);
        edtpass2 = (TextView) findViewById(R.id.edtpass2);
        btnDoubChk = (Button) findViewById(R.id.btnDoubChk);
        btnpassChk = (Button) findViewById(R.id.btnpassChk);
        btnNumSend = (Button) findViewById(R.id.btnNumSend);
        btnNumChk = (Button) findViewById(R.id.btnNumChk);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        btnDoubChk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "사용할 수 있는 아이디입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btnpassChk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtpass1.getText().toString().equals(edtpass2.getText().toString())){
                    Toast.makeText(RegisterActivity.this, "비밀번호가 일치합니다.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(RegisterActivity.this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnNumSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "인증번호가 발송되었습니다", Toast.LENGTH_SHORT).show();
            }
        });

        btnNumChk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "인증되었습니다", Toast.LENGTH_SHORT).show();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
