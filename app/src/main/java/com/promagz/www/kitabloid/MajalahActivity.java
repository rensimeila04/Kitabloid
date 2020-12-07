package com.promagz.www.kitabloid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MajalahActivity extends AppCompatActivity {
    Button btnShare, btnBackMajalah, like, comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majalah);

        ViewPager mViewPager = findViewById(R.id.viewPager);
        btnShare = findViewById(R.id.share);
        btnBackMajalah = findViewById(R.id.back_majalah);
        like = findViewById(R.id.like);
        comment = findViewById(R.id.comment);
        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Fitur komentar belum tersedia !",
                        Toast.LENGTH_LONG).show();
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Ditambahkan ke majalah yang disukai !",
                        Toast.LENGTH_LONG).show();

            }
        });
        btnBackMajalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBodyText = "Hello Magerz!\n Tunggu KiTabloid di Google PlayStore yaa...\nKiTabloid akan segera menemani kegabutanmu dengan fitur-fitur menarik!\nTunggu yaa!!\n\n\n Oiya jangan lupa untuk selalu menjaga kesehatan\nLove You All\n\n#staysafe\n#stayhealthy";
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject here");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
                startActivity(Intent.createChooser(sharingIntent, "Sharing Option"));
            }
        });
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);
    }
}