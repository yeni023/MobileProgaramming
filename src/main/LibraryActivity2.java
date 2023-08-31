package com.example.school;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LibraryActivity2 extends AppCompatActivity {
    Button btnGeneral, btnGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library2);

        Toolbar toolbar = findViewById(R.id.toolbar_library2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnGeneral = (Button) findViewById(R.id.btnGeneral);
        btnGroup = (Button) findViewById(R.id.btnGroup);
        
        btnGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LibraryActivity2.this, "열람실 예약하기", Toast.LENGTH_SHORT).show();
            }
        });

        btnGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LibraryActivity2.this, "그룹 스터디룸 예약하기", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
