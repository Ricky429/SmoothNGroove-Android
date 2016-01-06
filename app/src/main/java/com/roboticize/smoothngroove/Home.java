package com.roboticize.smoothngroove;

import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends Activity {

    private static ImageView imgView;
    private static Button buttonSbm;

    private int current_image_index;
    int[] images = {R.drawable.home_image1,R.drawable.home_image2,R.drawable.home_image3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
        buttonClick();

    }

    public void buttonClick() {
        imgView = (ImageView)findViewById(R.id.homeImage);
        buttonSbm = (Button)findViewById(R.id.button);
        buttonSbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        imgView.setImageResource(images[current_image_index]);
                    }
                }
        );
    }


    public void aboutUs(View view) {
        Intent startNewActivity = new Intent(this, AboutUsActivity.class);
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

    public void shop(View view) {
        Intent shopIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shopsmoothngroove.myshopify.com"));
        startActivity(shopIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
