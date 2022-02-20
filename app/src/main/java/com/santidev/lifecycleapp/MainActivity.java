package com.santidev.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Estoy en el onCreate",Toast.LENGTH_SHORT).show();
        Log.i("info", "Estoy en el onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Estoy en el onStart",Toast.LENGTH_SHORT).show();
        Log.i("info", "Estoy en el onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Estoy en el onResume",Toast.LENGTH_SHORT).show();
        Log.i("info", "Estoy en el onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Estoy en el onPause",Toast.LENGTH_SHORT).show();
        Log.i("info", "Estoy en el onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Estoy en el onStop",Toast.LENGTH_SHORT).show();
        Log.i("info", "Estoy en el onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Estoy en el onDestroy",Toast.LENGTH_SHORT).show();
        Log.i("info", "Estoy en el onDestroy");
    }
}