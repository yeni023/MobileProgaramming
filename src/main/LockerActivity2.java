package com.example.school;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LockerActivity2 extends AppCompatActivity {
    ImageButton btnhelp;
    Button btn_return, btn_extend, btn_close, btn8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locker2);

        Toolbar toolbar = findViewById(R.id.toolbar_locker2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnhelp = (ImageButton) findViewById(R.id.btnHelp2);
        btn_return = (Button) findViewById(R.id.btn_return);
        btn_extend = (Button) findViewById(R.id.btn_extend);
        btn_close = (Button) findViewById(R.id.btn_close);

        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(LockerActivity2.this, "반납하기", Toast.LENGTH_SHORT).show();
            }
        });
        
        btn_extend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_extend = new Intent(getApplicationContext(), LockerExtendActivity.class);
                startActivity(intent_extend);
            }
        });

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_help = new Intent(getApplicationContext(), LockerHelpActivity2.class);
                startActivity(intent_help);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_locker2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.lockerMap:
                Toast.makeText(getApplicationContext(), "지도", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}
