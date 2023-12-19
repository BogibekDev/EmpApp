package dev.bogibek.karantinagentlik.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import dev.bogibek.karantinagentlik.databinding.ActivityEmployeeListBinding

class EmployeeListActivity : AppCompatActivity() {
    private val binding by lazy { ActivityEmployeeListBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initViews() {
        val url = intent.getStringExtra("link") ?: "https://xorazm-karantin.uz/"
        with(binding.webView) {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            settings.setSupportZoom(true)
            loadUrl(url)
        }
    }
}