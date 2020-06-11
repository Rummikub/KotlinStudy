package com.sist.mywebapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var webView1=findViewById<WebView>(R.id.WebView)
        webView1.apply{
            settings.javaScriptEnabled=true
            webViewClient=WebViewClient()

        }
        webView1.loadUrl("http://www.daum.net")
        button.setOnClickListener{
            var url=urlEditView.text
            webView1.loadUrl(url.toString())
        }
    }
}