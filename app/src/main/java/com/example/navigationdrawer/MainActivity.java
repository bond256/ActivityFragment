package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private ArrayList<Integer> randomColor;
    private String tag = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "OnCreate");
        setContentView(R.layout.activity_main);
        randomColor = getRandomColor();
        drawerLayout = findViewById(R.id.drawerLayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                ColorFragment colorFragment;
                switch (item.getItemId()) {
                    case R.id.item1:
                        Bundle bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(0));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item2:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(1));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;

                    case R.id.item3:

                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(2));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item4:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(3));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;

                    case R.id.item5:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(4));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item6:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(5));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item7:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(6));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;

                    case R.id.item8:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(7));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item9:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(8));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item10:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(9));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item11:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(10));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    case R.id.item12:
                        bundle=new Bundle();
                        bundle.putString("Number",item.getTitle().toString());
                        bundle.putInt("Color",randomColor.get(11));
                        colorFragment=new ColorFragment();
                        colorFragment.setArguments(bundle);
                        break;
                    default:
                        return true;
                }
                getSupportFragmentManager()
                        .beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.flContent, colorFragment, null)
                        .commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return false;
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public ArrayList<Integer> getRandomColor() {
        ArrayList<Integer> randomColor = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Random random = new Random();
            int color = Color.argb(255, random.nextInt(255), random.nextInt(255), random.nextInt(255));
            randomColor.add(color);
        }
        return randomColor;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }
}