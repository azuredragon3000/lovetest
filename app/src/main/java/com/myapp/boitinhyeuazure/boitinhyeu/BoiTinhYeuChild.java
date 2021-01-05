package com.myapp.boitinhyeuazure.boitinhyeu;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.myapp.boitinhyeuazure.boitinhyeu.object.PulseAnimationView;


public class BoiTinhYeuChild extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String content = intent.getStringExtra("content");
        String number = String.valueOf(intent.getIntExtra("number",0))+"%";
        setContentView(new PulseAnimationView(this,content,number));
  }
}