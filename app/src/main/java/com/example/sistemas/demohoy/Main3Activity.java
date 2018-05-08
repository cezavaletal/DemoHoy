package com.example.sistemas.demohoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main3Activity extends AppCompatActivity {

    private WebView view1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        view1 =  findViewById(R.id.wb1);
        String url = getIntent().getStringExtra("URL");
        view1.getSettings().setJavaScriptEnabled(true);
        view1.setWebViewClient(new WebViewClient());
        view1.loadUrl("http://"+url);
    }

    public  void cerrar(View view){
        finish();
    }
}
