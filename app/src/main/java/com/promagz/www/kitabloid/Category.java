package com.promagz.www.kitabloid;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Category extends AppCompatActivity {
    Button btnBackCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        btnBackCategory = findViewById(R.id.back_category);
        btnBackCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        loadFragment(new ListFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container2, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void show(View view) {
        PopupMenu pop = new PopupMenu(this, view);
        pop.inflate(R.menu.view);
        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Fragment fr = null;
                switch (item.getItemId()) {
                    case R.id.list:
                        fr = new ListFragment();
                        break;
                    case R.id.grid:
                        fr = new GridFragment();
                        break;

                }
                return loadFragment(fr);
            }
        });
        pop.show();
    }

    public void showPopupMenu(View view) {
        /* Memunculkan menu saat tombol di klik */
        show(view);
    }
}