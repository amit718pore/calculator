package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import java.util.Objects;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Objects.requireNonNull(getSupportActionBar()).hide();  // to hide tool bar from splash screen
        Thread thread = new Thread(){
          public void run(){
              try {
                  sleep(2000);
              }catch (Exception e){
                  e.printStackTrace();
              }finally {
                  Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
        };thread.start();
    }
}