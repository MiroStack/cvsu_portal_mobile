package com.example.studentportal;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {
    WebView webView;
    ImageButton backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        webView =  findViewById(R.id.webView_id);
        backBtn = findViewById(R.id.backButton_id);
        // Enable JavaScript (optional, if needed)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Set a WebViewClient to handle page navigation in the WebView
        webView.setWebViewClient(new WebViewClient());

        // Load a URL

        webView.loadUrl("https://cvsu-map-godot.vercel.app/");


        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}
