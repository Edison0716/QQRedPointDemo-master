package com.github.redpointdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.redpointdemo.view.RedPointView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RedPointView view = (RedPointView) findViewById(R.id.redPointView);
        view.setText("299+");
    }
}
