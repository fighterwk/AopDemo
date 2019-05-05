package com.kyle.aopdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.kyle.aopdemo.annotation.CheckLogin
import com.kyle.aopdemo.annotation.Intercept

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.tv_hw)
                .setOnClickListener { v -> onTVClick(v) }
    }

    @CheckLogin
    fun onTVClick(v: View) {
        println("点击。。。。")
        onTVClick(v, "-----")
    }

    @Intercept("123946")
    fun onTVClick(v: View, text: String) {
        println("点击。。。。text")
    }
}
