package com.promagz.www.kitabloid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    private Button btnAll, btnSelengkapnya;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        btnSelengkapnya = view.findViewById(R.id.btn_selengkapnya);
        btnSelengkapnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelengkapnya = new Intent(getActivity(), Preview.class);
                startActivity(intentSelengkapnya);
            }
        });
        btnAll = view.findViewById(R.id.btn_all);
        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentAll();
            }
        });
        return view;
    }

    public void IntentAll() {
        Intent intent = new Intent(getActivity(), Category.class);
        startActivity(intent);
    }

}