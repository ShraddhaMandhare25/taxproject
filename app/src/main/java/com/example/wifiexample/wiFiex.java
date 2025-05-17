package com.example.wifiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class wiFiex extends AppCompatActivity {
Button b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi_fiex);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wm= (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE); //See the synatx properly '.' not there
                        wm.setWifiEnabled(true);
                Toast.makeText(wiFiex.this, "Wifi is turned on", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               WifiManager wm=(WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wm.setWifiEnabled(false);
                Toast.makeText(wiFiex.this, "wifi is turned off", Toast.LENGTH_SHORT).show();
            }
        });
    }
}