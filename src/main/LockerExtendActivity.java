package com.example.school;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LockerExtendActivity extends AppCompatActivity {
    ImageButton btnHelp;
    Button btn_cancel, btn_ok;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locker_extend);

        Toolbar toolbar = findViewById(R.id.toolbar_locker_extend);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_cancel = (Button) findViewById(R.id.btn_cancel);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        btnHelp = (ImageButton) findViewById(R.id.btnHelp3);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(LockerExtendActivity.this);
                dlg.setMessage("대여 시간이 90일 연장되었습니다.\n2023-09-12 13:59");
                dlg.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "사물함이 연장되었습니다.", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
                dlg.show();
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_help = new Intent(getApplicationContext(), LockerHelpActivity3.class);
                startActivity(intent_help);
            }
        });
    }
}
