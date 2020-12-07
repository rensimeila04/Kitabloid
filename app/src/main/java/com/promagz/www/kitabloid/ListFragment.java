package com.promagz.www.kitabloid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class ListFragment extends Fragment {
    private CardView showMagazine, coomingsoon2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        showMagazine = view.findViewById(R.id.card_magazine);
        coomingsoon2 = view.findViewById(R.id.card_magazine_cooming);
        coomingsoon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Majalah akan segera terbit !",
                        Toast.LENGTH_LONG).show();
            }
        });
        showMagazine.setOnClickListener(new View.OnClickListener() {
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