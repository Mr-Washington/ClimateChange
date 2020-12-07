package com.example.climatechange;

import androidx.appcompat.app.AppCompatActivity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main2();
                ;
            }
        });
    }
        public void openactivity_main2() {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        //TextView textView1 = findViewById(R.id.textView1);
        //textView1.setTextColor(Color.BLUE);
        //WebView myWebView = (WebView) findViewById(R.id.webview);
        //myWebView.loadUrl("https://developer.android.com/guide/webapps/webview#java");
    }


