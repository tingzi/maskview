package com.deep.androidexample.maskcut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.deep.androidexample.R;

public class MaskCutActivity extends AppCompatActivity {

    private MaskCutView followUpDialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mask_cut);

        followUpDialogView = findViewById(R.id.follow_up_dialog_view);
        followUpDialogView.setHeight(R.dimen.height);
        followUpDialogView.setRadius(R.dimen.radius);
        followUpDialogView.setPaddingTop(R.dimen.paddingTop);
        followUpDialogView.setPaddingLeft(R.dimen.paddingLeft);
        followUpDialogView.setPaddingRight(R.dimen.paddingRight);
    }
}
