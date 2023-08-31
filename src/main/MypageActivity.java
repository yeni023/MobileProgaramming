package com.example.school;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MypageActivity extends AppCompatActivity {
    Button btnModify;
    View dialogView;
    EditText edtMajor, edtNumber, edtName, edtId;
    TextView tvMajor, tvIdNumber, tvName, tvId;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        Toolbar toolbar = findViewById(R.id.toolbar_mypage);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvMajor = (TextView) findViewById(R.id.tvMajor);
        tvIdNumber = (TextView) findViewById(R.id.tvIdNumber);
        tvName = (TextView) findViewById(R.id.tvName);
        tvId = (TextView) findViewById(R.id.tvId);

        btnModify = (Button) findViewById(R.id.btnModify);
        
        btnModify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = (View) View.inflate(MypageActivity.this, R.layout.dialog_mypage, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MypageActivity.this);
                dlg.setTitle("정보수정");
                dlg.setView(dialogView);
                dlg.setPositiveButton("저장", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        edtMajor = (EditText) dialogView.findViewById(R.id.edtMajor);
                        edtNumber = (EditText) dialogView.findViewById(R.id.edtNumber);
                        edtName = (EditText) dialogView.findViewById(R.id.edtName);
                        edtId = (EditText) dialogView.findViewById(R.id.edtId);

                        tvMajor.setText(edtMajor.getText().toString());
                        tvIdNumber.setText(edtNumber.getText().toString());
                        tvName.setText(edtName.getText().toString());
                        tvId.setText(edtId.getText().toString());
                    }
                });
                dlg.show();
                Toast.makeText(MypageActivity.this, "정보수정", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
