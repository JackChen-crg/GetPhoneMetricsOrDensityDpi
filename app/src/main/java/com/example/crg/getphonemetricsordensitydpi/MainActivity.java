package com.example.crg.getphonemetricsordensitydpi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int with;
    private int height;
    private float density;
    private float densityDpi;
    private TextView withTextView;
    private TextView heightTextView;
    private TextView densityTextView;
    private TextView densityDpiTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMetrics();
        initView();

    }

    private void initView() {
        withTextView = (TextView) findViewById(R.id.with);
        heightTextView = (TextView) findViewById(R.id.height);
        densityTextView = (TextView) findViewById(R.id.desity);
        densityDpiTextView = (TextView) findViewById(R.id.desitydpi);
        withTextView.setText(with+"");
        heightTextView.setText(height+"");
        densityTextView.setText(density + "");
        densityDpiTextView.setText(densityDpi+"");
    }

    private void getMetrics() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        with = displayMetrics.widthPixels;
        height = displayMetrics.heightPixels;
        density = displayMetrics.density;
        densityDpi = displayMetrics.densityDpi;
    }

}
