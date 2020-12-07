package com.example.climatechange;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    private Button events;
    private Button back;
    private Button news;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        events = findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main3();
                ;
            }
        });
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main2();
                ;
            }
        });
        news = findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main4();
                ;
            }
        });
    }

    public void openactivity_main3() {
        Intent intent = new Intent(this, Events.class);
        startActivity(intent);
    }
    public void openactivity_main2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openactivity_main4() {
        Intent intent = new Intent(this, news.class);
        startActivity(intent);
    }
    //TextView textView1 = findViewById(R.id.textView1);
    //textView1.setTextColor(Color.BLUE);
    //WebView myWebView = (WebView) findViewById(R.id.webview);
    //myWebView.loadUrl("https://developer.android.com/guide/webapps/webview#java");
}
