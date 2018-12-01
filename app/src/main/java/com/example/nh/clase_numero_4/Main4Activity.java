package com.example.nh.clase_numero_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);
        Toast.makeText(this,"Welcome to the firebase chat",Toast.LENGTH_LONG).show();
    }
}
