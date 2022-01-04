package com.kennie.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_example);
    }


    public void click1(View view) {
        startActivity(new Intent(this, FirstActivity.class));
    }

    public void click2(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void click3(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}