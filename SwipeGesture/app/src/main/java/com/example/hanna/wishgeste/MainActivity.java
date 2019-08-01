package com.example.hanna.wishgeste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        View parent = findViewById(R.id.parentView);


        imageView.setOnTouchListener(new OnSwipeTouchListener(this, imageView, parent));
        parent.setOnTouchListener(new OnSwipeTouchListener(this, imageView, parent));

    }
}
