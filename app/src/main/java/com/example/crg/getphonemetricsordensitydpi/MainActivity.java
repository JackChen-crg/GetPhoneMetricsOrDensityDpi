package com.example.crg.getphonemetricsordensitydpi;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private int width;
    private int height;
    private float density;
    private float densityDpi;
    private float phoneScreenPhysicalSize;
    private double physicalWidth;
    private double physicalHeight;

    /**
     * display phone screen width pixels
     */
    private TextView widthTextView;

    /**
     *  display phone screen height pixels
     */
    private TextView heightTextView;

    /**
     *  display phone screen density
     */
    private TextView densityTextView;

    /**
     *  display phone screen density dpi
     */
    private TextView densityDpiTextView;

    /**
     *  display phone screen physical size
     */
    private TextView phonePhysicalSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMetrics();
        initView();

    }

    private void initView() {
        widthTextView = (TextView) findViewById(R.id.with);
        heightTextView = (TextView) findViewById(R.id.height);
        densityTextView = (TextView) findViewById(R.id.desity);
        densityDpiTextView = (TextView) findViewById(R.id.desitydpi);
        phonePhysicalSize = (TextView) findViewById(R.id.physical_size);
        widthTextView.setText(width +"");
        heightTextView.setText(height+"");
        densityTextView.setText(density + "");
        densityDpiTextView.setText(densityDpi+"");
        phonePhysicalSize.setText(phoneScreenPhysicalSize+" || " + "    宽为：" + physicalWidth + " || " + " 高为：" + physicalHeight);
    }

    private void getMetrics() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        Point point = new Point();
        getWindowManager().getDefaultDisplay().getRealSize(point);

        width = point.x;
        height = point.y;
        density = displayMetrics.density;
        densityDpi = displayMetrics.densityDpi;


        Log.d(TAG, "===> point.x: " + point.x);
        Log.d(TAG, "===> point.y: " + point.y);
        physicalWidth = width/displayMetrics.xdpi;
        physicalHeight = height/displayMetrics.ydpi;
        phoneScreenPhysicalSize = (float) Math.sqrt(Math.pow(physicalWidth, 2) + Math.pow(physicalHeight, 2));

    }

}
