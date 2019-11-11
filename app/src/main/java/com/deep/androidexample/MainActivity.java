package com.deep.androidexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.deep.androidexample.maskcut.MaskCutActivity;
import com.deep.androidexample.shadow.ShadowActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickMaskCut(View view) {
        startActivity(new Intent(this, MaskCutActivity.class));
    }

    public void clickShadow(View view) {
        startActivity(new Intent(this, ShadowActivity.class));
    }
}
