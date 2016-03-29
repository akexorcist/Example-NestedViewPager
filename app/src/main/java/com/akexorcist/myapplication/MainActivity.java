package com.akexorcist.myapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager vpContent;
    private MainAdapter mainAdapter;

    private Button btnP1;
    private Button btnP2;
    private Button btnP3;
    private Button btnP4;
    private Button btnP5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        setupView();
    }

    public void bindView() {
        btnP1 = (Button) findViewById(R.id.btn_p1);
        btnP2 = (Button) findViewById(R.id.btn_p2);
        btnP3 = (Button) findViewById(R.id.btn_p3);
        btnP4 = (Button) findViewById(R.id.btn_p4);
        btnP5 = (Button) findViewById(R.id.btn_p5);
        vpContent = (ViewPager) findViewById(R.id.vp_content);
    }

    public void setupView() {
        btnP1.setOnClickListener(this);
        btnP2.setOnClickListener(this);
        btnP3.setOnClickListener(this);
        btnP4.setOnClickListener(this);
        btnP5.setOnClickListener(this);
        mainAdapter = new MainAdapter(getSupportFragmentManager());
        vpContent.setAdapter(mainAdapter);
        select(0);
    }

    @Override
    public void onClick(View v) {
        if (v == btnP1) {
            select(0);
        } else if (v == btnP2) {
            select(1);
        } else if (v == btnP3) {
            select(2);
        } else if (v == btnP4) {
            select(5);
        } else if (v == btnP5) {
            select(8);
        }
    }

    public void select(int position) {
        setTitle("Page " + (position + 1));
        vpContent.setCurrentItem(position);
    }
}
