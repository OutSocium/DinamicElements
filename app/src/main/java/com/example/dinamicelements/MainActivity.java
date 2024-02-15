package com.example.dinamicelements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearlayout = findViewById(R.id.mainlayout);
        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setImageResource(R.drawable.ic_launcher_background);
        LayoutParams imageViewLayoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        imageView.setLayoutParams(imageViewLayoutParams);
        linearlayout.addView(imageView);
    }
}