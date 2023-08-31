package com.example.school;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LockerStateActivity extends AppCompatActivity {
    Button btn1_locker, btn2_locker, btn3_locker, btn4_locker, btn8;
    ImageButton btn_help;
    LockerMapFragment lockerMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locker_state);

        Toolbar toolbar = findViewById(R.id.toolbar_locker_state);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn1_locker = (Button) findViewById(R.id.btn1_locker);
        btn2_locker = (Button) findViewById(R.id.btn2_locker);
        btn3_locker = (Button) findViewById(R.id.btn3_locker);
        btn4_locker = (Button) findViewById(R.id.btn4_locker);

        btn8 = (Button) findViewById(R.id.btn8);
        btn_help = (ImageButton) findViewById(R.id.btnHelp);

        Drawable btnBack = btn8.getBackground();

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(LockerStateActivity.this);
//                if(btn8.getBackground().equals(btnBack)) {
                    dlg.setMessage("8번 사물함을 대여하시겠습니까?");
                    dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            btn8.setBackgroundColor(Color.parseColor("#F1C40F"));
                        }
                    });
                    dlg.show();
                }
//            }
        });

        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LockerHelpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_locker, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.lockerMyPage:
                Intent intent_btn8 = new Intent(getApplicationContext(), LockerActivity2.class);
                startActivity(intent_btn8);
                return true;
            case R.id.lockerMap:
                //lockerMapFragment = new LockerMapFragment();
                //getSupportFragmentManager().beginTransaction().replace(R.id.container_locker1, lockerMapFragment).commit();
                Toast.makeText(getApplicationContext(), "지도", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}
