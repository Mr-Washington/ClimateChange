package com.example.climatechange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Events extends AppCompatActivity {
    private Button home1;
    private Button home2;
    private Button events1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        events1 = findViewById(R.id.events1);
        events1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main1();
                ;
            }
        });
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main2();
                ;
            }
        });
        home2 = findViewById(R.id.home2);
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main3();
                ;
            }
        });

    }
    public void Myweb(View view){
        openURL("https://climate.nasa.gov/blog/");
    }
    public void Myweb2(View view){
        openURL("https://www.cnn.com/specials/world/cnn-climate");
    }
    public void Myweb3(View view){
        openURL("https://www.nytimes.com/section/climate");
    }
    public void Myweb4(View view){
        openURL("https://www.climate.gov/#slideshow-3");
    }
    public void openURL(String url){
        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
    public void openactivity_main3() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openactivity_main2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openactivity_main1() {
        Intent intent = new Intent(this, news.class);
        startActivity(intent);
    }
    //TextView textView1 = findViewById(R.id.textView1);
    //textView1.setTextColor(Color.BLUE);
    //WebView myWebView = (WebView) findViewById(R.id.webview);
    //myWebView.loadUrl("https://developer.android.com/guide/webapps/webview#java");
}
