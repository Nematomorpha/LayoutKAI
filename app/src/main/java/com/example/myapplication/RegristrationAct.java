package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RegristrationAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regristration);
    }

    public void pencet(View view) {
        String label = ((Button)view).getText().toString();
        Log.i("status", label + "Telah Ditekan");
    }

    public void Tonjok(View view) {
        String label = ((Button)view).getText().toString();
        Log.i("status", label + "Telah Ditekan");
    }
}