package com.roboticize.smoothngroove;

import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class BrandAboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_brand_about);
    }

    public void aboutUs(View view) {
        Intent startNewActivity = new Intent(this, AboutUsActivity.class);
        startActivity(startNewActivity);
    }

    public void shop(View view) {
        Intent shopIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shopsmoothngroove.myshopify.com"));
        startActivity(shopIntent);
    }


}
