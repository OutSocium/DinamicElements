package com.example.dinamicelements;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

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
        //linearlayout.addView(imageView);
       CheckBox enableLayer1 = (CheckBox) findViewById(R.id.enlayer1);


        LinearLayout mainLayer = (LinearLayout) findViewById(R.id.master);

        LayoutInflater inflater = getLayoutInflater();
       View layer1 = inflater.inflate(R.layout.layout1, null);

       enableLayer1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (isChecked) {
                   mainLayer.addView(layer1);
               } else {
                   mainLayer.removeView(layer1);
               }
           }
       });

       Button btn = (Button) findViewById(R.id.button2);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               addButton( mainLayer);
           }
       });
    }
    public void addButton (LinearLayout mainLayer){
       Button newBtn =  new Button (this);
       newBtn.setText("New Button");
       newBtn.setId(122);
       newBtn.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("ResourceType")
           @Override
           public void onClick(View v) {
               TextView text1 = findViewById(R.id.textView);
               text1.setText( String.valueOf( newBtn.getId() ));
           }
       });
       mainLayer.addView(newBtn);

    }
}