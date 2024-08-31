package com.zeynepslky.randomcolor;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button buttoncolors,buttonbackground;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        buttoncolors = (Button) findViewById(R.id.buttoncolors);
        buttonbackground = (Button) findViewById(R.id.buttonbackground);


        buttonbackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View someView = findViewById(android.R.id.content);
                View root = someView.getRootView();
                Resources res = getResources();
                @SuppressLint("Recycle") final TypedArray myImages = res.obtainTypedArray(R.array.image);
                final Random random = new Random();
                int randomInt = random.nextInt(myImages.length());
                int drawableID = myImages.getResourceId(randomInt, -1);
                root.setBackgroundColor(getResources().getColor(drawableID));
            }
        });

        buttoncolors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View someView = findViewById(android.R.id.content);
                //View root = someView.getRootView();
                Resources res = getResources();
                @SuppressLint("Recycle") final TypedArray myImages = res.obtainTypedArray(R.array.image);
                final Random random = new Random();
                int randomInt = random.nextInt(myImages.length());
                int drawableID = myImages.getResourceId(randomInt, -1);
                buttoncolors.setBackgroundColor(getResources().getColor(drawableID));
            }
        });
    }
}