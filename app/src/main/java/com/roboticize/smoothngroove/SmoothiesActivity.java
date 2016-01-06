package com.roboticize.smoothngroove;

import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class SmoothiesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_smoothies);
    }

    public void Home(View view) {
        Intent startNewActivity = new Intent(this, Home.class);
        startActivity(startNewActivity);
    }

    public void smoothieGang(View view) {
        Intent startNewActivity = new Intent(this, SmoothieGangActivity.class);
        startActivity(startNewActivity);
    }

    public void contactUs(View view) {
        Intent startNewActivity = new Intent(this, ContactUsActivity.class);
        startActivity(startNewActivity);
    }

    public void bigBuilt(View view) {
        Intent startNewActivity = new Intent(this, BigNBuiltActivity.class);
        startActivity(startNewActivity);
    }

    public void nErgizers(View view) {
        Intent startNewActivity = new Intent(this, NErgizersActivity.class);
        startActivity(startNewActivity);
    }

    public void aboutUs(View view) {
        Intent startNewActivity = new Intent(this, AboutUsActivity.class);
        startActivity(startNewActivity);
    }

    public void slimnTrim(View view) {
        Intent startNewActivity = new Intent(this, SlimNTrimActivity.class);
        startActivity(startNewActivity);
    }

    public void sweetnLow(View view) {
        Intent startNewActivity = new Intent(this, SweetNLowActivity.class);
        startActivity(startNewActivity);
    }

    public void shop(View view) {
        Intent shopIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shopsmoothngroove.myshopify.com"));
        startActivity(shopIntent);
    }


}
