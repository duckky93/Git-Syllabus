package com.example.kyler.inheritanceexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animal bird = new Bird("abc",2,2);
        Bird b = new Bird("abc",2,2);
        bird = new Bird("BBB",2,2);
        bird.move();
        bird.flyable();
    }
}
