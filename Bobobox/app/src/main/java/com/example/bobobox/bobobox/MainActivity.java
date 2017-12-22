package com.example.bobobox.bobobox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout boboboxLite;
    private LinearLayout boboboxStay;

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boboboxLite = (LinearLayout) findViewById(R.id.boboboxLiteLL);

        boboboxLite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, BookingHour.class);
                startActivity(intent);
            }
        });

        boboboxStay = (LinearLayout) findViewById(R.id.boboboxStayLL);

        boboboxStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, BookingDate.class);
                startActivity(intent);
            }
        });
    }
}
