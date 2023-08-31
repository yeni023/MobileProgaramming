package com.example.school;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class RentalActivity1 extends AppCompatActivity {
    Button btn_rental;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental1);

        Toolbar toolbar = findViewById(R.id.toolbar_rental1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_rental = (Button) findViewById(R.id.btnStart_rental);

        btn_rental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RentalActivity1.this, "시작하기", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
