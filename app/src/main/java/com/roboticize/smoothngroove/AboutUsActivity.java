package com.roboticize.smoothngroove;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.app.Activity;

public class AboutUsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about_us);
    }

    public void Home(View view) {
        Intent startNewActivity = new Intent(this, Home.class);
        startActivity(startNewActivity);
    }

    public void Smoothies(View view) {
        Intent startNewActivity = new Intent(this, SmoothiesActivity.class);
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

    public void keonAbout(View view) {
        Intent startNewActivity = new Intent(this, KeonAboutActivity.class);
        startActivity(startNewActivity);
    }

    public void brandAbout(View view) {
        Intent startNewActivity = new Intent(this, BrandAboutActivity.class);
        startActivity(startNewActivity);
    }

    public void shop(View view) {
        Intent shopIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shopsmoothngroove.myshopify.com"));
        startActivity(shopIntent);
    }

}
