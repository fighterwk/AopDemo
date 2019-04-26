package com.kyle.aopdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kyle.aopdemo.annotation.CheckLogin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @CheckLogin
    public void onTVClick(View v){
        System.out.println("点击。。。。");
        onTVClick(v, "-----");
    }

    public void onTVClick(View v, String text){
        System.out.println("点击。。。。text");
    }
}
