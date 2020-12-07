package com.example.climatechange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class news extends AppCompatActivity {
    private Button home3;
    private Button news1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        news1 = findViewById(R.id.news1);
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main1();
                ;
            }
        });
        home3 = findViewById(R.id.home3);
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main2();
                ;
            }
        });
    }
    public void Myweb(View view){
        openURL("https://www.eventbrite.com/");
    }
    public void openURL(String url){
        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }

    public void openactivity_main1() {
        Intent intent = new Intent(this, Events.class);
        startActivity(intent);
    }

    public void openactivity_main2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}