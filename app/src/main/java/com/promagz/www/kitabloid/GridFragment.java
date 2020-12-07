package com.promagz.www.kitabloid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class GridFragment extends Fragment {
    private CardView showMagazineGrid, coomingsoon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_grid, container, false);

        showMagazineGrid = view.findViewById(R.id.card_magazine_grid);
        coomingsoon = view.findViewById(R.id.card_magazine_grid_coomingsoon);
        coomingsoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Majalah akan segera terbit !",
                        Toast.LENGTH_LONG).show();
            }
        });
        showMagazineGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPreview();
            }
        });
        return view;
    }

    private void intentPreview() {
        Intent intent = new Intent(getActivity(), Preview.class);
        startActivity(intent);
    }
}