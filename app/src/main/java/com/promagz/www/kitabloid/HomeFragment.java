package com.promagz.www.kitabloid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    private Button btnAll, btnSelengkapnya;
    private CardView showMagazineawal1, coomingsoon1, showMagazineawal2, coomingsoon2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        btnSelengkapnya = view.findViewById(R.id.btn_selengkapnya);
        showMagazineawal2 = view.findViewById(R.id.card_magazine_awal2);
        coomingsoon2 = view.findViewById(R.id.card_magazine_awal_coomingsoon2);
        showMagazineawal1 = view.findViewById(R.id.card_magazine_awal);
        coomingsoon1 = view.findViewById(R.id.card_magazine_awal_coomingsoon);
        btnSelengkapnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPreview();
            }
        });
        btnAll = view.findViewById(R.id.btn_all);
        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentAll();
            }
        });

        coomingsoon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Majalah akan segera terbit !",
                        Toast.LENGTH_LONG).show();
            }
        });
        showMagazineawal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPreview();
            }
        });

        coomingsoon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Majalah akan segera terbit !",
                        Toast.LENGTH_LONG).show();
            }
        });
        showMagazineawal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPreview();
            }
        });
        return view;
    }

    public void IntentAll() {
        Intent intent = new Intent(getActivity(), Category.class);
        startActivity(intent);
    }

    private void intentPreview() {
        Intent intent = new Intent(getActivity(), Preview.class);
        startActivity(intent);
    }
}