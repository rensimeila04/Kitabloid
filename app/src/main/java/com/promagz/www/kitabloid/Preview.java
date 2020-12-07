package com.promagz.www.kitabloid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Preview extends AppCompatActivity {
    Button btnBackPreview, baca, favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        btnBackPreview = findViewById(R.id.back_preview2);
        favorite = findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplication(), "Ditambahkan ke favorite !",
                        Toast.LENGTH_LONG).show();

            }
        });
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