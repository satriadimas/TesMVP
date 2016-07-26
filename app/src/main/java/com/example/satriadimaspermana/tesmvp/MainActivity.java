package com.example.satriadimaspermana.tesmvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.satriadimaspermana.tesmvp.View.Pembagian;
import com.example.satriadimaspermana.tesmvp.View.Pengurangan;
import com.example.satriadimaspermana.tesmvp.View.Penjumlahan;
import com.example.satriadimaspermana.tesmvp.View.Perkalian;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kePenjumlahan(View view) {
        Intent i = new Intent(MainActivity.this, Penjumlahan.class);
        startActivity(i);
    }

    public void kePengurangan(View view) {
        Intent i = new Intent(MainActivity.this, Pengurangan.class);
        startActivity(i);
    }

    public void kePerkalian(View view) {
        Intent i = new Intent(MainActivity.this, Perkalian.class);
        startActivity(i);
    }

    public void kePembagian(View view) {
        Intent i = new Intent(MainActivity.this, Pembagian.class);
        startActivity(i);
    }
}
