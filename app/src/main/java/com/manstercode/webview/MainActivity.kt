package com.manstercode.webview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var webView:WebView
//lateint this means the variabl;e will be intialized later (in oncreate)
    //private means its only accessible in this class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.webv)
        webView.webViewClient = WebViewClient()
    //webview client makes aure URLS ARE loaded inside the spp instead external browser

        //Enable javascript
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

        //Load URL
        webView.loadUrl("https://www.google.com")

    }
    //Go back when the button is pressed
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}