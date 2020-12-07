package com.promagz.www.kitabloid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Preview extends AppCompatActivity {
    Button btnBackPreview, baca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        btnBackPreview = findViewById(R.id.back_preview2);
        baca = findViewById(R.id.baca);
        baca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Preview.this, MajalahActivity.class);
                startActivity(intent);
            }
        });
        btnBackPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}