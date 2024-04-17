package com.example.aplikasiseminarkpta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;




public class MainActivity2 extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{

    private BottomNavigationView bottomNavigationView;
    private HomeFragment homeFragment = new HomeFragment();
    private KpFragment kpFragment = new KpFragment();
    private TaFragment taFragment = new TaFragment();
    private LogoutFragment logoutFragment = new LogoutFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bottomNavigationView = findViewById(R.id.bottomView);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.kerjaPraktek) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, kpFragment).commit();
            return true;
        } else if (itemId == R.id.tugasAkhir) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, taFragment).commit();
            return true;
        } else if (itemId == R.id.logOut) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, logoutFragment).commit();
            return true;
        } else if (itemId == R.id.home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
            return true;
        }
        return false;
    }

}