package com.home.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.textViewScroll);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
    public void sendMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}