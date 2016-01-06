package com.roboticize.smoothngroove;

import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class SweetNLowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sweet_nlow);
    }

    public void Smoothies(View view) {
        Intent startNewActivity = new Intent(this, SmoothiesActivity.class);
        startActivity(startNewActivity);
    }

    public void shop(View view) {
        Intent shopIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shopsmoothngroove.myshopify.com"));
        startActivity(shopIntent);
    }
}
