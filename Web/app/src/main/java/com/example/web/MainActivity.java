package com.example.web;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    //WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://pei5171.wixsite.com/letspark/blank");
        webView.setInitialScale(280);
        webView.setWebViewClient(new aaaWebviewClient());
    }

    private class aaaWebviewClient extends WebViewClient {
        public boolean shouldOverrideUriLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
