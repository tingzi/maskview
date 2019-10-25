package com.deep.androidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MaskCutView followUpDialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        followUpDialogView = findViewById(R.id.follow_up_dialog_view);
        followUpDialogView.setHeight(R.dimen.height);
        followUpDialogView.setRadius(R.dimen.radius);
        followUpDialogView.setPaddingTop(R.dimen.paddingTop);
        followUpDialogView.setPaddingLeft(R.dimen.paddingLeft);
        followUpDialogView.setPaddingRight(R.dimen.paddingRight);
    }
}
