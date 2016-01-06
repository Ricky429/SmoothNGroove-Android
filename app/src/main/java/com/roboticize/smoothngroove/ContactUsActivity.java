package com.roboticize.smoothngroove;

import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class ContactUsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_contact_us);
    }

    public void shop(View view) {
        Intent shopIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shopsmoothngroove.myshopify.com"));
        startActivity(shopIntent);
    }

    public void twitter(View view) {
        Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/smoothngroove1"));
        startActivity(twitterIntent);
    }

    public void facebook(View view) {
        Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/SMOOTHNGROOVE2/"));
        startActivity(facebookIntent);
    }

    public void instagram(View view) {
        Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/smoothngroove/"));
        startActivity(instagramIntent);
    }

    public void Home(View view) {
        Intent startNewActivity = new Intent(this, Home.class);
        startActivity(startNewActivity);
    }

    public void smoothieGang(View view) {
        Intent startNewActivity = new Intent(this, SmoothieGangActivity.class);
        startActivity(startNewActivity);
    }

    public void Smoothies(View view) {
        Intent startNewActivity = new Intent(this, SmoothiesActivity.class);
        startActivity(startNewActivity);
    }

    public void aboutUs(View view) {
        Intent startNewActivity = new Intent(this, AboutUsActivity.class);
        startActivity(startNewActivity);
    }

    public void sendEmail(View view) {
        Intent intent=null, chooser=null;

        if(view.getId()==R.id.sendEmail) {
            intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"info@smoothngroove.com", "info@smoothngroove.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "SmoothNGroove");
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent, "Send Email");
            startActivity(chooser);
        }
    }

}
